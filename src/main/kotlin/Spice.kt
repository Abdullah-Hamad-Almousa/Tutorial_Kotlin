package com.MysticByte

fun main() {
    val simpleSpice = SimpleSpice()
    simpleSpice.printing()
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