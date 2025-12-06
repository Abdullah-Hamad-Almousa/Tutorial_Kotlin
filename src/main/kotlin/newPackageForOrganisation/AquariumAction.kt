package com.MysticByte.newPackageForOrganisation

interface AquariumAction{

    fun eat();

}

/*interface FishAction{

    fun eat()

}*/

abstract class AquariumFish: FishAction{

    abstract val color: String;
    override fun eat() = println("yum");

}