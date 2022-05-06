package com.company

import com.company.IO.getCoordinates
import com.company.IO.printGrid
import com.company.IO.printScore
import com.company.Iogic.Grid

class Game {
//    Grid with size 5*5
    private val grid = Grid(5, 5)

    fun game() {
        var moves = 0
        grid.createRandGrid()
        var winning = false
        while (!winning) {
            printGrid(grid)
            rotateValues()
            moves++


            winning = win(moves)
        }
    }
//  Rotate values of this and 4 near fields
    private fun rotateValues() {
        val coo = getCoordinates(grid)
        ifSwitchedValueIsValid(coo[0],coo[1])
        ifSwitchedValueIsValid(coo[0]-1,coo[1])
        ifSwitchedValueIsValid(coo[0]+1,coo[1])
        ifSwitchedValueIsValid(coo[0],coo[1]-1)
        ifSwitchedValueIsValid(coo[0],coo[1]+1)
    }
// Check if value is valid, if yes change it
    private fun ifSwitchedValueIsValid(x: Int, y: Int) {
        if (x >= 0 && y >= 0 && x < grid.xLen && y < grid.yLen) {
            grid.grid[x][y].changeVal()
        }
    }

    private fun win(moves: Int): Boolean {
        for (i in grid.grid) {
            for (j in i) {
                if (j.isLight) {
                    return false
                }
            }
        }
        printScore(moves)
        return true
    }
}