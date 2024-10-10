package com.vpahovich.kotlincourse.lesson11

fun main () {

    val task1 = mapOf<Int, Int>()
    val task2 = mapOf<Float, Int> (23F to 2, 41F to 6)
    val task3 = mutableMapOf<Int, String> (1 to "Hello", 2 to "Kotlin", 4 to "Fun")

    task3[3] = "World"

    println(task3[3])
    println(task3[512])

    task3.remove(1)

    task3[4] = "Very Fun"
    println(task3[4])

    println(task7())
    println(task9())

    val task10 = mutableMapOf<String ,List<Int>>("Hello" to listOf(1,2,3))
    task10["World"] = listOf(4,5,6)
    println (task10)

    val task11 = mutableMapOf<Int, MutableList<String>>(2 to mutableListOf("Test", "Yes"))
    println(task11[2])
    task11[2]?.add("Hello")
    println(task11[2])
}

fun task7 (){
    val myMap3 = mapOf<Double,Int>(3.0 to 1, 2.5 to 2, 5.1 to 0)
    for ((key, value) in myMap3){
        if (value == 0) {
            println("Бесконечность")
        }
        else println(key / value)
    }
}

fun task9 (){
    val myMap4 = mapOf<String, String>("Hello" to "World", "Kotlin" to "Fun")
    val myMap5 = mapOf<String,String>("Goodbye" to "World", "Java" to "Not fun")
    val myMap6 = mutableMapOf<String, String>()
    for ((key, value) in myMap4){
        myMap6[key] = value

    }
    for ((key, value) in myMap5){
        myMap6[key] = value
    }
    println(myMap6)
}