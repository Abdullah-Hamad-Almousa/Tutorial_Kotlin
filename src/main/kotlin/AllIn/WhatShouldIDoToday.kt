package com.MysticByte.AllIn

fun main(args: Array<String>){

    println("What is you mood?");
    val mood: String? = readLine();
    whatShouldIDoToday(mood);
    spicesList();

}

fun whatShouldIDoToday(mood: String?, weather: String = "Sunny", temperature: Int = (-15..55).random()){

    when{
        mood == "happy" && weather == "Sunny" -> println("Go for a walk");
        mood == "sad" && weather == "rainy" -> println("stay home");
        temperature > 35 -> println("Go for swimming");
        else -> println("Stay home and read");
    }

}

fun spicesList(){

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper");

    var sortSpices = spices.sortedBy { it.length };

    println(sortSpices);
    //use start with and ends with for a safer but can do in normal way [0] and [it.length-1]
    var eager = spices.filter { it.startsWith('c') && it.endsWith('e') };
    println(eager);

    println(spices.filter { it[0] == 'c' });

}

val rollDice = {(1..12).random()};
