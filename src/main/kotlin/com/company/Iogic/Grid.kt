package com.company.Iogic

import java.util.Random

data class Grid(val xLen: Int, val yLen: Int) {

    var grid = Array(yLen) { Array(xLen) { Field(0, 0, false) } }
    private val rand = Random()

//    Creates rand boolean grid by init size(Light or not)
    fun createRandGrid(){
        for(i in grid.indices){
            for(j in grid[i].indices){
                grid[i][j] = Field(i,j,rand.nextBoolean())
            }
        }
    }
}