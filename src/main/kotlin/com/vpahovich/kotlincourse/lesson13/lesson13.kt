package com.vpahovich.kotlincourse.lesson13

fun main() {
    val collection = listOf(52, 22, 51, 73)
    val strings = listOf("war", "name", "game", "win")
    printAll(
        collection.size > 5,
        collection.isEmpty(),
        collection.isNotEmpty(),
        collection.getOrElse(1) { 13 },
        collection.joinToString { "" },
        collection.sum(),
        collection.average(),
        collection.max(),
        collection.min(),
        collection.firstOrNull(),
        collection.contains(51),
        collection.filter { it in 18..30 },
        collection.filterNot { it % 2 == 0 && it % 3 == 0 },
        collection.filterNotNull(),
        strings.map { "$it".length },
        strings.associate { it to it.reversed() },
        strings.sorted(),
        strings.sortedDescending(),
        strings.groupBy { it.firstOrNull() },
        strings.distinct(),
        collection.take(3),
        collection.takeLast(3)
    )
    collection.forEach { println(it * it) }
    val empty = listOf<Int>()
    println(task2(empty))
    val short = listOf<Int>(1, 2, 3)
    println(task2(short))
    val start = listOf<Int>(0, 1, 2, 3, 4, 5)
    println(task2(start))
    val massive = listOf<Int>(10, 100, 1000, 10000, 100000)
    println(task2(massive))
    val balanced = listOf<Int>(10, 10, 10, 10, 10, 10)
    println(task2(balanced))
    val sticky = List(20) { 1 }
    println(task2(sticky))
    val negative = listOf<Int>(-100, -99, -10, -50, -60)
    println(task2(negative))
    val positive = listOf<Int>(1001, 1002, 1003, 1024, 1016)
    println(task2(positive))
    val pussy = listOf<Int>(1, 2, 3, 10, 14)
    println(task2(pussy))
    val unique = listOf<Int>(1, 1, 1, 1, 1)
    println(task2(unique))

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(
        grades.filter { it > 60 }
            .sorted()
            .take(3)
    )

    val list = listOf(
        "Стол",
        "табурет",
        "ваза",
        "Кружка",
        "Зеркало",
        "ковер",
        "Шкаф",
        "часы",
        "Люстра",
        "подушка",
        "Картина",
        "столик",
        "Вазон",
        "шторы",
        "Пуф",
        "книга",
        "Фоторамка",
        "светильник",
        "Коврик",
        "вешалка",
        "Подставка",
        "телевизор",
        "Комод",
        "полка",
        "Абажур",
        "диван",
        "Кресло",
        "занавеска",
        "Бра",
        "пепельница",
        "Глобус",
        "статуэтка",
        "Поднос",
        "фигурка",
        "Ключница",
        "плед",
        "Тумба",
        "игрушка",
        "Настенные часы",
        "подсвечник",
        "Журнальный столик",
        "сувенир",
        "Корзина для белья",
        "посуда",
        "Настольная лампа",
        "торшер",
        "Этажерка"
    )
    println(
        list.map { it.lowercase() }
            .groupBy { it[0] }
    )

    println("Средняя длина: %.2f".format(list.map { it.length }.average()))

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(
        numbers.distinct()
            .sortedDescending()
            .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
    )

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(
        ages.filterNotNull()
            .firstOrNull { it > 18 }
            ?.toString() ?: "Подходящий возраст не найден")
}

fun printAll(vararg args: Any?) {
    for (i in args) {
        println(i)
    }
}

fun task2(numList: List<Int>): String {
    return when {
        numList.isEmpty() -> "Пусто"
        numList.size < 5 -> "Короткая"
        numList.getOrNull(0) == 0 -> "Стартовая"
        numList.sum() > 10000 -> "Массивная"
        numList.min() > 10000 -> "Положительная"
        numList.average() == 10.0 -> "Сбалансированная"
        numList.joinToString("").length == 20 -> "Клейкая"
        numList.max() <= -10 -> "Отрицательная"
        numList.contains(3) && numList.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }

}