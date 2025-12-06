package com.MysticByte.Decorations

enum class Colors(val rgb: Int){

    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00),
    BROWN(0xA52A2A),
    CLEAR(0xFFFFFF);

}

sealed class Beverage(val color: Colors)

object TeaCan : Beverage(Colors.GREEN)
object Coffee : Beverage(Colors.BROWN)
object Coke : Beverage(Colors.CLEAR)

fun printer(beverage: Beverage): String{

    return when (beverage) {
        is TeaCan -> "Tea Can (color: ${beverage.color.name}," +
                " RGB: #${beverage.color.rgb.toString(16).uppercase().padStart(6, '0')})"
        is Coffee -> "Coffee (color: ${beverage.color.name})"
        is Coke -> "Coke (color: ${beverage.color.name})"
    }

}

fun main(args: Array<String>) {

    println(printer(TeaCan))
    println(printer(Coffee))
    println(printer(Coke))

}