package com.example.aswitch

class MyClass {
}
fun main(args: Array<String>) {
    val ch = 'i'

//    val vowelConsonant =
//        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"
when (ch){
    'i'-> println("Vowel")
    'a'-> println("Vowel")
    'e'-> println("Vowel")
    'o'-> println("Vowel")
    'u'-> println("Vowel")
    else -> println("Consonant")

}
//    println("$ch is $vowelConsonant")
}
//    val x = 4
//    when (x) {
//        3 -> println("yes")
//        8 -> println("no")
//        else -> println("maybe")

//    }
// when can also be used as an expression!
//    val y = when (x) {
//        3 -> "yes"
//        8 -> "no"
//        else -> "maybe"
//    }
//    println(y) // "yes"


