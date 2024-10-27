package com.vpahovich.kotlincourse.lesson15

fun main(){

    val task1 = Party("International street", 15)
    task1.details()

    val task2 = Emotion("Laugh", 10)
    task2.express()

    Moon.showPhase()

    Moon.isVisible = true
    Moon.phase = "Full Moon"

    Moon.showPhase()

    val task4 = Product ("Eggs", 32.2, 125)
    println(task4)

    val task5 = Concert ("Group1", "Location1", 12.5, 100)
    task5.info()
    task5.buyTicket()
}