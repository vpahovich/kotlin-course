package com.vpahovich.kotlincourse.lesson10

fun main () {

    val emptySet = setOf<Int>()

    val setNumb = setOf(1, 2, 3)

    val setString = mutableSetOf("Kotlin", "Java", "Scala")
    setString.add("Swift")
    setString.add("Go")
    println(setString)

    val setNumb2 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    setNumb2.remove(2)
    println(setNumb2)

    val setNumb3 = mutableSetOf<Int>(1, 2, 3, 4, 5)
    for (i in setNumb3) {
        println(i)
    }

    val set1 = setOf(1,2,3)
    val set2 = setOf(3,4,5,6)
    val set3 = mutableSetOf<Int>()
    for (i in set1){
        set3.add(i)
    }
    for (i in set2){
        set3.add(i)
    }
    println(set3)

    println(findString(setOf("A","V","B"),"C"))
}


    fun findString (setString: Set<String>, string:String): Boolean {
        for (i in setString){
            if (i == string){
                return true
            }
        }
        return false
    }
