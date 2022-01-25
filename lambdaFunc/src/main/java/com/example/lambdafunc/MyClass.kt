package com.example.lambdafunc

class MyClass {
}

fun main(args: Array<String>) {
//    unit means void
//    var mLambda: (Int) -> Unit= {a:Int -> print(a)}
//    mLambda(1)
    val  addLambda: (Int) -> (Int) = {s:Int -> s+5}
    add(20,addLambda)

    val  subLambda: (Int) -> (Int) = {t:Int -> t-5}
    sub(40,subLambda)

//    agr Unit rakhengy to fun m e print krwana pryga like:
    val  nameLambda: (String) -> (Unit) = {u:String -> println(u+" Khan")}
    nameLambda("Mehrosh")

    val  stingLambda: (String) -> (String) = {v:String -> v+" Wardag"}
//    nameLambda("Mehrosh")
    name("Mehrosh Khan",stingLambda)
    val fn:(String,String)->String={org,portal->"$org develop $portal"}
    myFun("sssit.org","javatpoint.com",fn)
}
fun add(i:Int , j: (Int) -> (Int)){
    println(j(i))
}
fun sub(k:Int , l: (Int) -> (Int)){
    println(l(k))
}

fun name(m:String , n: (String) -> (String)){

    println(n(m))
}
fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {
    val result = fn(org,portal)
    println(result)
}