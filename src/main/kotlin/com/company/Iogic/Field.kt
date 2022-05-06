package com.company.Iogic


data class Field(val x: Int, val y: Int, var isLight: Boolean){
//    Change field value
    fun changeVal(){
        isLight = !isLight
    }
}
