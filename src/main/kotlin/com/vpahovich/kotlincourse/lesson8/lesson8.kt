package com.vpahovich.kotlincourse.lesson8

fun main (){

print (homework())
    }

//fun convert (string: String): String {
//    return when {
//        string.contains("невозможно", true) -> string.replace("невозможно", "совершенно точно возможно, просто требует времени", true)
//        string.startsWith("Я не уверен", true) -> {"$string , но моя интуиция говорит об обратном"}
//        string.contains("катастрофа", true) -> string.replace("катастрофа", "интересное событие", true)
//        string.endsWith("без проблем", true) -> string.replace ("без проблем", "с парой интересных вызовов на пути", true)
//        string.contains("Удача", true) -> {"Иногда, $string, но не всегда"}
//        else -> ""
//    }



fun homework () {
    val test = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val indexOfAdd = test.indexOf(">")
    val string = test.substring(indexOfAdd + 2)
    println(string.split(" "))
}

fun homework2 (){
    val numb = "4539 1488 0343 6467"
    val subString = numb.substring(15)
    println("XXXX XXXX XXXX $subString")
}

fun homework3 () {
    val text = "username@example.com"
    val text2 = text.replace("@"," [at] ").replace("."," [dot] ")
    println(text2)
}

fun homework4 () {
    val test = "C:/Пользователи/Документы/report.txt"
    val result = test.substringAfterLast("/")

    println(result)
}