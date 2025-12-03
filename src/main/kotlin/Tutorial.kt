package com.MysticByte

import java.time.LocalDateTime
import java.util.Arrays
import java.util.Calendar
import kotlin.math.pow
import kotlin.math.roundToInt;
import java.util.Random

fun main(args: Array<String>){

    HelloWorld();

    dayOfWeek();

    time();

    feedTheFish();

    print("Enter your birthday: ");

    val birthday = readLine()?.toIntOrNull() ?: 1;

    val messageOfTheDay = getFortuneCookie(birthday);

    println("Your message of the day is: $messageOfTheDay")

}

fun HelloWorld(){

    println("Hello World");
    val fish = "World";

    println(fish +"\n");
    println("Fish total: ${2+71+233-13}, Total aquariums: ${((2+71+233-13) / 30.0).roundToInt()}");

    var rainbow = "color";
    rainbow = "Red";
    val blackColor = "Black";

    println("$rainbow ;\t; $blackColor");
    //rainbow = null Error

    var greenColor: String? = null;
    var blueColor = null;

    val listA = listOf<String?>(null, null);
    var listB: List<String?> = listOf(null, null);

    println("$listA ;\t; $listB");

    var nullTest: Int? = null;

    println(nullTest?.inc() ?:0);

    var boolA = rainbow == blackColor;
    var boolB = rainbow == rainbow;

    println("$boolA ;\t; $boolB");

    var numA = 50;

    if (numA in 1..100) println(numA);

    when(numA){
        0 -> println("Empty");
        50 -> println("Full");
        else -> println("Perfect");
    }

    var listFishA = listOf<String>("Trout", "Haddock", "Snapper");

    for (item in listFishA){
        when(item){
            "Trout" -> println("I do not know what is this fish");
            "Haddock" -> println("The name is not promising");
            "Snapper" -> println("How is that not a sniper but a fish");
            else -> println("Not in the menu");
        }
    }

    when(listFishA.size){
        0 -> println("Not a name for a fish");
        in 3..15 -> println("Real name for a Fish");
        else -> println("Some nasty name named by Americans");
    }

    val school = arrayOf("Tuna", "Fish", "Shark");
    var numTest = intArrayOf(0,1,2);

    val mixArray = arrayOf("Fish", 0);
    val mixHugeArray = arrayOf(numTest, school, mixArray, 15);

    println(Arrays.toString(mixHugeArray));

    //mixHugeArray.forEach { println(it) };

    val arrayOfOf = Array(7) { it * 3 };
    println(arrayOfOf.asList());

    for (item in arrayOfOf){
        print("|$item|\t");
    }

    println();

    for (i in 'a'..'z'){
        print("|$i|\t");
    }

    println();

    for (i in 0..7){
        print("|$i|\t");
    }

    println();

    for (i in 7 downTo 1){
        print("|$i|\t");
    }

    println();

    for (i in 3..7 step 2){
        print("|$i|\t");
    }

    println();

    val arrayS = arrayOf("byte", "kilobyte", "megabyte", "gigabyte", "terabyte", "petabyte", "exabyte");
    val arrayBit = Array(7){1000.0.pow(it)};

    for ((i, value) in arrayBit.withIndex()){
        println("1 ${arrayS[i]} = ${value.toLong()} bytes");
    }

    val numbers = IntArray(5);

    for (i in 11..15){
        numbers[i-11] = i;
    }

    println(numbers.contentToString());

    val listEpy: MutableList<Int> = mutableListOf();

    for (i in 0..100 step 7){
        listEpy.add(i)
    }

    print("${listEpy.toString()}");

}

fun dayOfWeek(){

    println("\nWhat day is it today?");

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

    println( when (day){

        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Issues in time"

    });

    val isUnit = println("This is an expression");
    println(isUnit);

    val temperature = 10;
    val isHot = if (temperature > 50) true else false;
    println(isHot);

    val message = "You are ${ if (temperature > 50) "fired" else "safe" } fish";
    println(message);

}

fun time(){

    val myTime = LocalDateTime.now();
    val hours = myTime.hour;
    val minutes = myTime.minute;
    val seconds = myTime.second;

    println("$hours $minutes $seconds");

    println("Good ${ if (LocalDateTime.now().hour < 12) "morning" else "night" }, Kotlin");

}


fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}
fun feedTheFish(){

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

    val tureDay = when (day){

        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Issues in time"

    }

    val food = "Pellets";
    println("Today is $tureDay and the fish eat ${ if (tureDay == "Tuesday") food else "Daphnia"}");

    val randomDay = randomDay()
    println("Today is $tureDay and the fish eat ${ if (randomDay == "Tuesday") food else "Daphnia"}");

}

fun getFortuneCookie(birthday: Int) : String{

    val messageOfTheDay = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    );

    val index = birthday % messageOfTheDay.size
    return messageOfTheDay[index]

}