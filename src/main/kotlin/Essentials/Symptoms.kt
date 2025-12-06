package com.MysticByte.Essentials

fun main(args: Array<String>) {

    val symptoms: MutableList<String> = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up");

    symptoms.add("white fungus");
    symptoms.remove("white fungus");

    symptoms.contains("red");
    symptoms.contains("red spots");

    println(symptoms.subList(4, symptoms.size)); //belly up

    listOf(1, 3, 5).sum(); //9

    listOf("a", "b", "cc").sumBy { it.length }; // 4

}