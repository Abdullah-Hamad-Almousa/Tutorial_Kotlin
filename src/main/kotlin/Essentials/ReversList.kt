package com.MysticByte.Essentials

class ReversList{



}

fun reversList(list: List<Int>): List<Int>{

    val result: MutableList<Int> = mutableListOf<Int>();
    for (i in 0..list.size-1){
        result.add(list[list.size-i-1]);
    }

    return result;
}

fun reversListAgain(list: List<Int>): List<Int>{

    val result: MutableList<Int> = mutableListOf<Int>();
    for (i in list.size-1 downTo 0){
        result.add(list.get(i));
    }

    return result;
}

fun main(args: Array<String>) {

    val testList: List<Int> = (11..20).toList();

    println(reversList(testList));
    println(reversListAgain(testList));

}