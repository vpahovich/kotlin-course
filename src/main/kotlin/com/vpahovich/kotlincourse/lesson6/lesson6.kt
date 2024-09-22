package com.vpahovich.kotlincourse.lesson6

fun main(){
    seasonOfTheYear(12)
    typeOfTransport(10)
    documentType("txt")
    clothingAccordingToTheWeather(-20)



}

fun seasonOfTheYear(month: Int)  {
    return if (month <=0 || month >12) {
        println("Неверное значение")
    }
    else if (month in 1..2 || month == 12) {
        println("Зима")
    }
    else if (month in 3..5) {
        println("Весна")
    }
    else if (month in 6..8) {
        println("Лето")
    }
    else {
        println("Осень")
    }
    }

fun typeOfTransport (routeLength:Int) {
    when (routeLength) {
        in 0..1 -> println("Пешком")
        in 2..5 -> println("Велосипед")
        else -> println("Транспорт")
    }
}

fun documentType(type: String)  {
    return if (type == "txt") {
        println("Текстовый ")
    }
    else if (type == "png") {
    println("Изображение")
    }
    else if (type == "xls"){
        println("Таблица")
    }
    else { println("Незивестный тип")}
}

fun clothingAccordingToTheWeather(temp: Int)  {
    return if (temp <= -30 || temp > 35) {
        println("Не выходить на улицу")
    }
    else if (temp < 0) {
        println("Куртка и шапка")
    }
    else if (temp in 0..15) {
        println("Ветровка")
    }
    else {
        println("Футболка и шорты")
    }
}
