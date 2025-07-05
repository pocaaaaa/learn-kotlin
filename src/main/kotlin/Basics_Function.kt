package com.example.kotlinbasics

// 데이터 클래스에서는 함수를 정의할 수 없음.
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAcount: Int
)

fun main() {
    val coffeeForDenis = CoffeeDetails(0, "denis", "xxl", 0)
    makeCoffee3(coffeeForDenis)
}

fun returnTestCode() {
    println("Enter number 1")
    val num1Str = readln();

    println("Enter number 2")
    val num2Str = readln()

    val num1Int = num1Str.toInt()
    val num2Int = num2Str.toInt()
    val myAddResult = add(num1Int, num2Int)

    val num1D = num1Str.toDouble()
    val num2D = num2Str.toDouble()
    val myResult = divide(num1D, num2D)
    println("The result is $myResult")
}

fun divide(num1: Double, num2: Double): Double {
    val result = num1/num2
    return result
}

fun add(num: Int, num2: Int): Int {
    val result = num + num2
    return result
}

fun askDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    // Call Function
    makeCoffee2(sugarCountInt, name)
}

// Define Function
fun makeCoffee() {
    println("Buy beans")
    println("Grind beans")
    println("Heat water to 90°C")
    println("Add water")
    println("Push hot water through the  grinded beans")
}

fun makeCoffee2(sugarCount: Int, name: String) {
    if(sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name")
    } else if (sugarCount == 0) {
        println("Coffee with no sugar for Denis")
    } else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
}

fun makeCoffee3(coffeeDetails: CoffeeDetails) {
    if(coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} " +
                "spoon of sugar for ${coffeeDetails.name} " +
                "and cream: ${coffeeDetails.creamAcount}")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffee with no sugar for Denis" +
                "and cream: ${coffeeDetails.creamAcount}")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} " +
                "spoons of sugar for ${coffeeDetails.name}" +
                "and cream: ${coffeeDetails.creamAcount}")
    }
}