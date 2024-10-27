package com.vpahovich.kotlincourse.lesson15

object Moon{
    var isVisible: Boolean = false
    var phase: String = "New Moon"


fun showPhase() {
    if (isVisible) {
        println("Луна сейчас в фазе: $phase")
    } else {
        println("Луну не видно")
    }
}
}