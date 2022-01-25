package com.example.loop

class MyClass {
}
fun main(args : Array<String>) {
    for_loop()
    abc()
    usingWhile()
    }

fun usingWhile() {
   
        var j = 1
        while (j<=5){
            println(j)
            j++
        }

}

fun abc() {
    print("printing 1 to 5:  ")
    for (i in 1..5) print(i)
    println()
}

fun for_loop(){
        val marks = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13)
        for(item in marks){
            println(item)
    }

}