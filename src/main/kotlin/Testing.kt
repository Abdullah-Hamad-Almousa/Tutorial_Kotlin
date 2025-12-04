package com.MysticByte

fun main(args: Array<String>) {

    val rollDice = { sides: Int -> (1..sides).random() };

    val rollDice2: (Int) -> Int = { sides -> (1..sides).random() };

    println("Roll dice 2: ${rollDice2(2)}");

    gamePlay(rollDice2(4));

}

fun gamePlay(rollDice: Int){

        println("Roll dice 1: ${rollDice()}");


}