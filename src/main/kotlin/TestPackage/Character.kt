package com.MysticByte.TestPackage

interface CharacterColor {
    val color: String
}

object BlueColor : CharacterColor {
    override val color = "blue"
}

abstract class Character(open var health: Int = 100) {
    abstract val name: String
    abstract fun specialAbility()
    val status: String get() = if (health > 50) "Healthy" else "Injured"
}

class Mage(
    override val name: String,
    override var health: Int,
    color: CharacterColor = BlueColor  // ← plain param, type = CharacterColor
) : Character(health), CharacterColor by color {
    override fun specialAbility() {
        println("Fireball!")
    }
}

fun main() {
    val mage = Mage("MysticByte", 90);
    println(mage.color)
    mage.specialAbility()
}