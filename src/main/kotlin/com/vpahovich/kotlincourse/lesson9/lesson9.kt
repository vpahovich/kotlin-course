package com.vpahovich.kotlincourse.lesson9

fun main (){
    println (happyBirthday("Александр", 32))

}

fun happyBirthday (name: String, age: Int) {
    println("Дорогой $name! От всей души поздравляю тебя с Днём Рождения! Сегодня тебе исполнилось $age!\uD83C\uDF89 \uD83C\uDF89")
    return when (age) {
        in 1.. 18 -> println("Ну и помотала тебя жизнь конечно!))")
        in 19..35 -> println("Считай, что ещё вся жизнь впереди! Впереди столько всего ещё нового и интересного!")
        in 36..50 -> println("Могу сказать только одно - отлично сохранился!)")
        else -> println("Врать не хорошо")
    }

}