package com.MysticByte.newPackageForOrganisation

fun main(args: Array<String>) {
    val simpleSpice = SimpleSpice()
    simpleSpice.printing()

    val spices = listOf(
        Spice("Curry", "mild"),
        Spice("Paprika", "medium"),
        Spice("Cayenne", "hot"),
        makeSalt(),
        Spice("Black Pepper", "medium"),
        Spice("Ghost Pepper", "very hot")
    )

    val notTooSpicy = spices.filter { it.heat <= 10 }

    println("\nSpices with heat <= 10:")
    notTooSpicy.forEach { println("- ${it.name} (heat: ${it.heat})") }
}

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> 0
        }

    fun printing() {
        println(name)
        println(heat)
    }

}

class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5;
            "medium" -> 10;
            "hot" -> 15;
            "very hot" -> 20;
            else -> 0;
        }
        init {
        println("Created spice: $name, spiceness: $spiciness, heat: $heat");
    }
}

fun makeSalt(): Spice = Spice("salt", "none");