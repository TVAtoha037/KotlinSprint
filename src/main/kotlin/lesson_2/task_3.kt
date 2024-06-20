package org.example.lesson_2

const val DIVISOR_VALUE: Byte = 60
fun main() {
    val checkOutTimeHours:Byte = 9
    val checkOutTimeMinutes:Byte = 39

    val timeOfWay: Short = 457

    val timeDeparture: Short = getTimeDepartureOfMinutes(checkOutTimeHours, checkOutTimeMinutes)

    val timeArrivalOfMinutes = (timeDeparture + timeOfWay).toShort()

    println(getTimeArrivalFromMinutes(timeArrivalOfMinutes))
}

fun getTimeDepartureOfMinutes(hour: Byte, minutes: Byte): Short {
    return (hour * DIVISOR_VALUE + minutes).toShort()
}

fun getTimeArrivalFromMinutes(timeArrivalOfMinutes: Short): String {
    val hoursArrival = timeArrivalOfMinutes / DIVISOR_VALUE
    val minutesArrival = timeArrivalOfMinutes % DIVISOR_VALUE

    return String.format("%02d:%02d", hoursArrival, minutesArrival)
}



