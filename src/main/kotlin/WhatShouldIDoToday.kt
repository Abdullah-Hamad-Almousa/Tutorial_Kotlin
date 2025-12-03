package com.MysticByte

fun main(args: Array<String>){

    println("What is you mood?");
    val mood: String? = readLine();
    whatShouldIDoToday(mood);

}

fun whatShouldIDoToday(mood: String?, weather: String = "Sunny", temperature: Int = 24){

    when{
        mood == "happy" && weather == "Sunny" -> println("Go for a walk");
        else -> println("Stay home and read");
    }

}