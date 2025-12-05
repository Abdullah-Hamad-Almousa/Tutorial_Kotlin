package com.MysticByte.newPackageForOrganisation

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

    val size: Int;
        init {
            println("First init block");
        }
        constructor(): this(true, 9){
            println("Running secondary constructor");
        }

        init {
            if (friendly){
                size = volumeNeeded;
            }else{
                size = volumeNeeded * 2;
            }
        }

        init {
            println("Constructor fish of size $volumeNeeded final size ${this.size}");
        }

        init {
            println("last init block");
    }

}

fun makeDefaultfish() = Fish(true, 50);

fun fishExample(){

    val fish = Fish(true, 20);
    println("Is the fish friendly? ${fish.friendly}. It need volume ${fish.size}");

}

fun main(args: Array<String>) {

    println(Fish());
    makeDefaultfish();
    fishExample();

}