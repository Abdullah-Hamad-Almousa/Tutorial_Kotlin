package com.MysticByte


/*

fun volume() = width * length * height / 1000;

another way to do

val volume : Int
        get(){
            return width * length * height / 1000
        }

*/

class ClassesKotlin(var length: Int = 100, var width: Int = 20, var height: Int = 40){

    var volume : Int
        get() = width * length * height / 1000
        set(value){height = (value * 1000) / (width * length)
    }

    var water = volume * 0.9;

    constructor(numFish: Int): this() {

        val water: Int = numFish * 2000; //cm3
        val tank: Double = water + water * 0.1;
        height = (tank / (length * width)).toInt();

    }

}

fun main(args: Array<String>) {



}