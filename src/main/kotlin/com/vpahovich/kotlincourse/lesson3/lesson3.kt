package com.vpahovich.kotlincourse.lesson3

const val NAME: String = "Hackathon Survival" // Название не изменится

var date: String = "13.09.2024" // Дату проведения могут перенести

val place: String = "Syktyvkar, International street"

private var budget: String = "100000"

var member: Int = 0
    get() = field
    private set(value) {field = value}

var duration: Long = 8*60*60

private lateinit var contactInformation: String

var status: String = "Не начат"

val sponsors: String = ""

var internetAccessLevel: Int = 0

val mood: String by lazy {""}

private var information: String = ""

lateinit var plan: String

lateinit var specialGuest: String

var numberOfCommands: Int = 0

val tasks: String = "задачи"

val evacuationPlan: String = "Plan"

var listOfAvailableEquipment: String = "50"

var listOfFreeEquipment: String = "50"

val planInCaseOfFailures: String = "План мероприятия на случай сбоев"

