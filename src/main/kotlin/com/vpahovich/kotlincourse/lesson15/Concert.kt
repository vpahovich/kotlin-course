package com.vpahovich.kotlincourse.lesson15

class Concert(
    val group: String,
    val location: String,
    val ticketPrice: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 100
    fun info(){
        println("Концерт группы: $group, пройдет по адресу $location. Стоимость билета: $ticketPrice. Количество мест: $capacity. Билетов продано: $soldTickets")
    }
    fun buyTicket(){
        if(soldTickets < capacity){
            soldTickets++
        }
        else{
            println("Увы, мест не осталось!")
        }
    }
}