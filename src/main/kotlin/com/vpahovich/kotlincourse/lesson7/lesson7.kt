package com.vpahovich.kotlincourse.lesson7

fun main (){
//    for (i in 10 downTo  1){
//        println (i)
//    }
//    for (i in 20 downTo 2 step 2){
//        println(i)
//    }
//    for (i in 20 downTo 2){
//        if (i % 2 == 0) {
//            println(i)}
//    }
//    for (i in 1..30 step 3){
//        println(i)
//    }
//    var count = 1
//    var sum = 0
//    while (count <= 10 ){
//        sum = sum + count++
//    }
//    println(sum)
//    var count =  100
//    while (count > 1){
//       println(count--.toString().length)
//    }

    //Домашка.
//    for (i in 1..5){
//        println(i)
//    }

//    for (i in 1..10){
//        if (i % 2 == 0){
//            println(i)
//        }
//    }

//    for (i in 5 downTo 1){
//        println(i)
//    }

//    for (i in 10 downTo 1){
//        println(i - 2)
//    }

//    for (i in 1..9 step 2){
//        println(i)
//    }

//    for (i in 1..20 step 3){
//        println (i)
//    }

//    for (i in 1 until 9){
//        println(i)
//    }

//    for (i in 3 until 15){
//        println (i)
//    }

//    var i = 1
//    while (i++ <= 5){
//        println(i * i)
//    }


//    var i = 10
//    while (--i > 5){
//
//    }
//    println(i)

//    var i = 5
//    do {
//        println(i--)
//    } while (i > 0)

//    var i =5
//    do {
//        println(i++)
//    } while (i < 10)

//    for (i in 1..10){
//        if (i == 6) break
//        println(i)
//    }

//    var i = 1
//    while(i >= 1){
//        if (i == 10) break
//        println(i++)
//    }

//    for (i in 1..10){
//        if (i % 2 == 0) continue
//        println(i)
//    }

//    var i = 1
//    while (i <= 10) {
//        if (i % 3 == 0){
//            i += 1; continue
//        }
//        println (i++)
//    }

    for (i in 1..10){
        for (q in 1..10){
            print(i * q)
            print (" ")
        }
        println()
    }

}