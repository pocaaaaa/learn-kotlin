package com.example.kotlinbasics

fun main() {
    // Creating an object of the class Dog
    val daisy = Dog("daisy", "Dwarf poodle", 1)
    println("${daisy.name} is a ${daisy.bread} and is ${daisy.age} years old")
    println("A year has passed!")
    daisy.age = 2
    println("${daisy.name} is a ${daisy.bread} and is ${daisy.age} years old")
}