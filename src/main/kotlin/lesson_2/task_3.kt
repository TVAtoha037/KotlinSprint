package org.example.lesson_2

fun main() {
    val checkOutTimeHours:Int = 9
    val checkOutTimeMinutes:Int = 39

    val timeOfWay: Int = 457

    val timeDeparture: Int = getTimeDepartureOfMinutes(checkOutTimeHours, checkOutTimeMinutes)

    val timeArrivalOfMinutes = timeDeparture + timeOfWay

    println(getTimeArrivalFromMinutes(timeArrivalOfMinutes))
}

fun getTimeDepartureOfMinutes(hour: Int, minutes: Int): Int {
    return hour * 60 + minutes
}

fun getTimeArrivalFromMinutes(timeArrivalOfMinutes: Int): String {
    val hoursArrival = timeArrivalOfMinutes / 60
    val minutesArrival = timeArrivalOfMinutes % 60

    return String.format("%02d:%02d", hoursArrival, minutesArrival)
}



