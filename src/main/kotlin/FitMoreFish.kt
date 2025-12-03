package com.MysticByte

import kotlin.random.Random

fun main(args: Array<String>){

    print("Enter Number Of Fishes You Want To Add:");
    val addFish = readLine()?.toIntOrNull() ?: 1;
    println("\nAdd The Size Of Fishes:");
    val sizeFish = readLine()?.toIntOrNull() ?: 1;

    val(tankSize, currentFish, fishSize, hasDecorations) = fitMoreFish();
    val answear = checkFit(tankSize, currentFish, fishSize, hasDecorations, addFish, sizeFish)
    val totalUsed = (currentFish * fishSize) + (addFish * sizeFish)
    if (answear==true){
        println("It will fit the size of the tank $tankSize Liters, and number of fishes ${currentFish + addFish}, Total space has been taken" +
                " $totalUsed cm, is it Deocoratited $hasDecorations");
    }else {
        println("Forget that");
    }

}

fun checkFit(tankSize: Int, currentFish: Int, fishSize: Int, hasDecorations: Boolean, addFish: Int, sizeFish: Int): Boolean{

    var tankSizeii = tankSize;

    if (hasDecorations == true){
        tankSizeii = tankSize - 2;
    }

    tankSizeii = tankSizeii - currentFish * fishSize;

    tankSizeii = tankSizeii - addFish * sizeFish

    if (tankSizeii <= 0){ return false }
    else{ return true }
}

data class RandomValues(

    val tankSize: Int,
    val currentFish: Int,
    val fishSize: Int,
    val hasDecorations: Boolean

)

fun fitMoreFish(): RandomValues {

    val tankSize = (1..10).random() * 10
    val currentFish = 1
    val fishSize = 5
    val hasDecorations = Random.nextBoolean()

    return RandomValues(tankSize, currentFish, fishSize, hasDecorations)
}