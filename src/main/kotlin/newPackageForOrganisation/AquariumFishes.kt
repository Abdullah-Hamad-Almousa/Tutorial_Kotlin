package com.MysticByte.newPackageForOrganisation

abstract class AquariumFishes {

    abstract val color: String;

}

class Shark(override val color: String = "gray") : AquariumFishes(), FishAction{
    override fun eat() {
        println("Hunt and eat Fish");
    }

}

class Plecostomus(override val color: String = "gold") : AquariumFishes(), FishAction{

    override fun eat() {
        println("Munch on algae");
    }

}

interface FishAction{

    fun eat();

}

fun feedFish(fish: FishAction){

    fish.eat();

}

fun main(args: Array <String>){

    val shark = Shark();
    val plecostomus = Plecostomus();

    println("Shark: ${shark.color} \nPlecostomus: ${plecostomus.color}")

    shark.eat();
    plecostomus.eat();
    feedFish(shark);

}