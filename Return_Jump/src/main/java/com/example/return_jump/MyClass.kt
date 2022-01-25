package com.example.return_jump

class MyClass {
}
fun main(args: Array<String>) {
    breakJump()
    returnStatement()
    continueStatement()

}

fun continueStatement() {
    for (l in 1..3) {
        println("l = $l")
        if (l == 2) {
            continue
        }
        println("this is below if")
    }
}

fun returnStatement() {
    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2)
                break@loop
        }
    }
}

fun breakJump() {
    for (i in 1..5) {
        if (i == 4) {
            break
        }
        println(i)
    }
}
