package com.company.IO
import com.company.Iogic.Grid


fun printGrid(grid: Grid){
    println("Light = *\nDark = 0\n")
    for (i in grid.grid){
        for (j in i){
            if(j.isLight){
                print("*")
            }
            else{
                print("0")
            }
        }
        println("")
    }
}


fun printScore(moves: Int){
    println("Player win after $moves moves")
}