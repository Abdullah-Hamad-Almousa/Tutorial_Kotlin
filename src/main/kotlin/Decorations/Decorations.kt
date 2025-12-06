package com.MysticByte.Decorations

data class Decorations(val rocks: String){
}

data class Decorations2(val rocks: String, val wood: String, val driver: String){}

fun makeDecorations(){

    val d1 = Decorations("Granite");
    println(d1);

    val d2 = Decorations("Slate");
    println(d2);

    val d3 = Decorations("Slate");
    println(d3);

    println(d1.equals(d2));
    println(d3.equals(d2));

    val d4 : Decorations = d3.copy();
    println(d3);
    println(d4);

    val d5 = Decorations2("Crystal", "Oak", "Captain diver");
    println(d5);

    val (rock: String, wood: String, diver: String) = d5;
    println(rock);
    println(wood);
    println(diver);

}

fun main(args: Array<String>) {
    makeDecorations();
}