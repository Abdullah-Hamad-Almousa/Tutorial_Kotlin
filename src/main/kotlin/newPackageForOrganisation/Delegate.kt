package com.MysticByte.newPackageForOrganisation

fun main(args: Array<String>) {

    delegate();

}

fun delegate(){

    val pleco = Plecostomus();
    println("Fish has color ${pleco.color}");
    pleco.eat();

}

interface FishAction{
    fun eat();
}

interface FishColor{
    val color: String;
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction,
    FishAction by PrintingFishAction("A lot of alage"),
FishColor by fishColor{

    override fun eat() {
        println("Eat alage");
    }

    override val color: String
        get() = "Gold";

}

object GoldColor: FishColor{
    override val color = "Gold";
}

object RedColor: FishColor{
    override val color = "Red";
}

class PrintingFishAction(val food: String): FishAction{

    override fun eat() {
        println(food);
    }

}