package org.example.lesson_1

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"

    println(year)
    println(hour)
    println(minute)

    hour = String.format("%02d", 10)
    minute = String.format("%02d", 55)


    println("$hour:$minute")

}



