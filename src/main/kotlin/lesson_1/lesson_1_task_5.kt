package org.example.lesson_1

const val DIVISOR_VALUE: Byte = 60

fun main() {

    val gagarinSpaceTimeSeconds : Short = 6480

    val allMinutesInSpace: Byte = (gagarinSpaceTimeSeconds / DIVISOR_VALUE).toByte()

    val secondsInSpace: Byte = (gagarinSpaceTimeSeconds % DIVISOR_VALUE).toByte()
    val minutesInSpace: Byte = (allMinutesInSpace % DIVISOR_VALUE).toByte()
    val hoursInSpace: Byte = (allMinutesInSpace / DIVISOR_VALUE).toByte()

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace))
}



