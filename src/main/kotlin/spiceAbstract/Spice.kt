package com.MysticByte.spiceAbstract

interface SpiceColor {
    val color: String;
}

interface Grinder {
    fun grind() {
        println("Grinding spice into powder");
    }
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow";
}

abstract class Spice(
    val name: String,
    val spiciness: String = "mild"
) : SpiceColor {

    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5;
            "medium" -> 10;
            "hot" -> 15;
            else -> 0;
        }

    abstract fun prepareSpice();

    init {
        println("Created spice: $name, spiciness: $spiciness, heat: $heat");
    }
}

class Curry(
    spiciness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice("Curry", spiciness),
    Grinder,
    SpiceColor by color {
    override fun prepareSpice() {
        //println(prepareSpice());
    }
}

fun main() {
    val curry = Curry("hot");
    curry.prepareSpice();
    println("Curry color: ${curry.color}");
}