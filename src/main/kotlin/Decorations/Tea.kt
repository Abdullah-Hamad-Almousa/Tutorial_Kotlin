package com.MysticByte.Decorations

data class Tea(val name: String) {}

data class TeaContainer(val tea: Tea){

    val label: String
    get() = "Fresh cup of ${tea.name} tea"

}

fun main(args: Array<String>) {

    val greenTea = Tea("Green");
    val container0 = TeaContainer(greenTea);
    println(container0.label);

    val redTea = Tea("Red");
    val container1 = TeaContainer(redTea);
    println(container1.label);

    val chamomile = Tea("Chamomile");
    val container2 = TeaContainer(chamomile);
    println(container2.label);

    //OR

    println()
    listOf("Green", "Red", "Chamomile")
        .map { TeaContainer(Tea(it)) }
        .forEach { println(it.label)
    }

}