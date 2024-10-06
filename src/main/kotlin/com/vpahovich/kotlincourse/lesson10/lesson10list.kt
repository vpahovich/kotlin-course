package com.vpahovich.kotlincourse.lesson10

fun main () {
    val list = listOf<Int> ()

    val list1: List<String> = listOf("Hello", "World", "Kotlin")

    val list2 = mutableListOf<Int> (1, 2, 3, 4, 5)
    list2.add(6)
    list2.add(7)
    list2.add(8)
    println(list2)

val list3 = mutableListOf("Htllo", "World", "Kotlin")
    list3.removeAt(1)
    println(list3)

    val list4 = listOf<Int> (1,2,3,4,5)
    for (i in list4){
        println(i)
    }
val list5: List<String> = listOf("Hello", "World", "Kotlin")
    println(list5[1])

    val list6 = mutableListOf(5,10,20,30)
    list6[1] = 100
    println(list6)
}