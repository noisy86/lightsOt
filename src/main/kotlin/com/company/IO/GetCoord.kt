package com.company.IO
import com.company.Iogic.Grid


fun getCoordinates(grid: Grid): IntArray {
    println("Which one rotate")
    val o = readln().split(" ")

    val output = intArrayOf(o[0].toInt(), o[1].toInt())

    if (output[0] >= 0 && output[1] >= 0 && output[0] < grid.xLen && output[1] < grid.yLen) {
        return output
    }

        println("Bad request")
        return getCoordinates(grid)

}