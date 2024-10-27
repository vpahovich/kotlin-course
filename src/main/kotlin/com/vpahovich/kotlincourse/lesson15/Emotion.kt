package com.vpahovich.kotlincourse.lesson15

class Emotion(
    val type: String,
    var intensity: Int
) {
    fun express(){
        val intensityDescription = when (intensity){
            in 1..4 -> "Low"
            in 5..10 -> "Medium"
            in 11..15 -> "High"
            else -> "Unknown"
        }
        println("Эмоция: $type, интенисвность: $intensityDescription")
    }
}