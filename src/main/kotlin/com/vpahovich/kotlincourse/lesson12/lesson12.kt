package com.vpahovich.kotlincourse.lesson12

fun main() {
    println(multiplyByTwo(5))
    println(isEven(5))
    println(printNumbersUntil(10))
    println(findFirstNegative(mutableListOf(-5, 20, -5, 1, 0, -5)))
    println( processList(mutableListOf("1s","2a","3d","")))
}

fun fun1() {}

fun fun2(a: Int, b: Int) = a + b

fun fun3(s: String) {}

fun fun4(s: List<Int>): Double {
    return 2.0
}

fun fun5(s: String?): Int? {
    return null
}

fun fun6(): Int? {
    return null
}

fun fun7(s: List<Int>?) {
}

fun fun8(s: Int): String? {
    return null
}

fun fun9(): List<String>? {
    return null
}

fun fun10(s: String, s1: Int?): Boolean? {
    return null
}

fun multiplyByTwo(s: Int) = s * 2

fun isEven(s: Int) {
    if (s % 2 == 0) {
        println("true")
    } else println("false")
}

fun printNumbersUntil(n: Int) {
    var i = 1
    while (i <= n) {
        println(i)
        i++
    }
    if (n < 0) {
        return
    }

}

fun findFirstNegative(n: MutableList<Int>) {
    for (i in n) {
        if (i < 0) {
            println(i)
        } else return
    }
}

fun processList (s:MutableList<String>){
    for (i in s){
        println(i)
    }
    return
}