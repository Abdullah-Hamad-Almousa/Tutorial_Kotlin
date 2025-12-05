package com.MysticByte

fun main(args: Array<String>) {

    buildAquarium();

}

fun buildAquarium(){

    val myAquarium = ClassesKotlin();

    println("Length: ${myAquarium.length}"
    +" Width: ${myAquarium.width}"+
    " Height: ${myAquarium.height}");

    myAquarium.height = 80;

    println("Height: ${myAquarium.height} cm");
    println("Volume: ${myAquarium.volume} liters");
    println(sumNum())

    val smallAquarium = ClassesKotlin(20, 15, 30);
    println("Small Aquarium: ${smallAquarium.volume} liters");

    val myAquarium2 = ClassesKotlin(numFish = 9);
    println("Small Aquarium 2: ${smallAquarium.volume} liters with"+
    " length: ${myAquarium2.length}"+
    " width: ${myAquarium2.width}" +
    " height: ${myAquarium2.height}");
}

fun sumNum() = listOf(4, 3, 2, 1).sum();