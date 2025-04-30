package com.pro.practice

fun main(args: Array<String>) {
      var namebook = Book()
    namebook.title = "Safir"
    namebook.author = "Reza"


    var namebook1 = Book()
    namebook1.title = "Sad"
    namebook1.author = "Ramin"

    println("Book name is ${namebook.title} and the Author is ${namebook.author}")
    println("Book name is ${namebook1.title} and the Author is ${namebook1.author}")

}