package com.example.whileloop

class MyClass {

    }
fun main(args: Array<String>) {
   loopWhile()
    loopDoWhile()
    }

fun loopWhile() {
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }
    println("Do While:")
}
fun loopDoWhile(){
    var j = 1
    do {
        println(j)
        j++
    }
    while (j<=5);
}