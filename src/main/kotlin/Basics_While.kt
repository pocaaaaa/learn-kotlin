package com.example.kotlinbasics

fun main() {
    var count = 0
    while (count < 3) {
        // so long this content will be executed
        println("Count is $count")
        count++ // count = count + 1 or count += 1
    }
    println("Loop is done!")

    var userInput = readln()
    while (userInput == "1") {
        println("While loop executed")
        userInput = readln()
    }
    println("Loop is done2!")
}