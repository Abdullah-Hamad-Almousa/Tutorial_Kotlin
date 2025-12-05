package com.MysticByte.newPackageForOrganisation

abstract class Animal{

    fun sleep(){
        println("All animal can sleep");
    }

    abstract fun makeSound();

}

class Cat: Animal(){

    override fun makeSound() {
        println("Meow!");
    }

}

class Dog: Animal(){

    override fun makeSound() {
        println("Woof!");
    }

}

fun main(args: Array<String>) {

    Cat().makeSound();
    Dog().makeSound();

    println("Java Version: ${System.getProperty("java.version")}");
    println("Kotlin Version: ${KotlinVersion.CURRENT}");

}