package com.vpahovich.kotlincourse.lesson15

class Party (
    val location: String,
    val attendees: Int
) {
    fun details(){
        println("Вечеринка будет проходить по адресу: $location, гостей: $attendees")
    }


}