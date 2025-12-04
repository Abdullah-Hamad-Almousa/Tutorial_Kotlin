package com.MysticByte

fun main(args: Array<String>) {

    buildAquarium();

}

fun buildAquarium(){

    val myAquarium = ClassesKotlin();

    println("Length: ${myAquarium.length}"
    +" Width: ${myAquarium.width}"+
    " Height: ${myAquarium.height}");

}