package org.example.lesson_1

fun main() {
    val secondsInSpace: UShort = 6480u

    val seconds: UShort = (secondsInSpace % 60u).toUShort()

    val minutesInSpace = (secondsInSpace / 60u).toUShort()
    val minutes: UShort = (minutesInSpace % 60u).toUShort()

    val hours = (minutesInSpace / 60u).toUShort()

    println(String.format("%02d:%02d:%02d", hours.toInt(), minutes.toInt(), seconds.toInt()))
}



