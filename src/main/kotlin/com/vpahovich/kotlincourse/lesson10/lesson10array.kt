package com.vpahovich.kotlincourse.lesson10

fun main () {

    val array = intArrayOf(1, 2, 3, 4, 5)
    println(array.toList())


    val array1 = Array(10) { "" }
    println(array1.toList())

    val array2 = DoubleArray(5)
    for (i in array2.indices) {
        array2[i] = i * 2.0
    }
    println(array2.toList())


    val array3 = IntArray(5)
    for (i in array3.indices) {
        array3[i] = i * 3
    }
    println(array3.toList())

    val array4 = arrayOf(1,2,3)
    val array5 = Array(3) { 0 }
    for (i in array4.indices) {
        array5[i] = array4[i]
    }
    println(array4.toList())

    val array6 = arrayOf(10,20,30)
    val array7 = arrayOf(5, 10, 15)
    val array8 = Array(3) { 0 }
    for (i in array6.indices) {
        array8[i] = array6[i] - array7[i]
    }
    println(array8.toList())

}