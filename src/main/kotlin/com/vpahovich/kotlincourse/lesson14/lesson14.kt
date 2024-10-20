package com.vpahovich.kotlincourse.lesson14

fun main() {
    val map1 = mapOf<String, Int>("Иванов" to 150, "Петров" to 280, "Сидоров" to 650)
    println(map1.values.average()) //среднее время выполнения теста.

    val map2 = mutableMapOf<String, String>("Test1" to "Result1", "Test2" to "Result2", "Test3" to "Result3")
    println(map2.keys.joinToString(" ")) //Выведите список всех тестовых методов.
    map2["Test4"] = "Result4" //добавьте новый тест и его результат.
    println(map2)

    val map3 = mapOf<String, String>("Test1" to "True", "Test2" to "False", "Test3" to "True")
    println(map3.values.count { it == "True" })//Посчитайте количество успешных тестов в словаре с результатами

    val map4 = mutableMapOf<String, String>("Bag1" to "NoFixed", "Bag2" to "Fixed", "Bag3" to "NotFixed")
    map4.values.remove("Fixed")
    println(map4)

    val map5 = mapOf<String, Int>("https://www.google.ru/?hl=ru" to 243, "https://ru.wikipedia.org/wiki" to 520)
    for ((key, value) in map5) {
        println("Страница: $key. Статус: $value")
    }

    val map6 = mapOf<String, Int>(
        "Service1" to 200,
        "Service2" to 540,
        "Service3" to 120,
        "Service4" to 250
    ).filterValues { it > 230 }
    println(map6)


    val map7 =
        mapOf("API1" to "Result1", "API2" to "Result2", "API3" to "Result3").getOrDefault("API4", "Не протестирован")
    println(map7)

    val map8 = mapOf<String, String>("browserType" to "Chrome", "OS" to "Windows").getValue("browserType")
    println(map8)

    val map9 = mapOf<String, String>("V1" to "1.2.3", "V2" to "1.3.5")
    val mutableMap9 = map9.toMutableMap()

    val map10 = mapOf<String, String>("Samsung" to "Android 10", "IPhone" to "iOS 11").getOrDefault("Redmi", "Default")
    println(map10)

    val map11 = mapOf<String, String>("Code1" to "Description1", "Code2" to "Description2", "Code3" to "Description3").containsKey("Code1")
    println(map11)

    val map12 = mapOf<String, String>("TestID_Version1" to "Passed", "TestID_Version2" to "Skipped", "TestID_Version3" to "Failed").filterKeys { it.contains("TestID_Version1") }
    println(map12)
}