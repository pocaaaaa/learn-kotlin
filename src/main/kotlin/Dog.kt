package com.example.kotlinbasics

// val name: String -> 프로퍼티 (실제 객체의 일부)
// name: String -> 매개변수 (그저 객체에 정보를 전달)
class Dog (val name: String, val bread: String, var age: Int = 0) {

    // 클래스 객체를 생성하는 순간 실행되는 코드
    init {
        bark(name)
    }

    fun bark(name: String) {
        println("$name says Woof Woof")
    }
}