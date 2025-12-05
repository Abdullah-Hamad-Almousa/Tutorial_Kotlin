package com.MysticByte.newPackageForOrganisation

open class Book(var title: String, var author: String) {
    private var currentPage: Int = 0;
    open fun readPage(){

        currentPage+=1;
        println("Reading page $currentPage of $title")
    }

}

class eBook(title: String, author: String, val format: String = "text"): Book(title, author){

    private var wordsRead: Int = 0;

    override fun readPage(){

        wordsRead += 250;
        println("Read 250 words total: $wordsRead from $title $format");

    }

}

fun main(args: Array<String>) {

    val paperBook = Book("How To Code", "Mystic Byte");
    paperBook.readPage();

}