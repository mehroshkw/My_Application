package com.example.ifcondition

class MyClass {
}
fun main(args: Array<String>) {

    val num1 = 40

    val result = if (num1 < 33) {
        println("Sorry You are Fail")
    } else {
      println("Congratulations! You are pass")
    }
    println(result)
}
