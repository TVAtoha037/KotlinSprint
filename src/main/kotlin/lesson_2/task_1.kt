package org.example.lesson_2

fun main() {
    val childrens: UShort = 4u

    val oneMark: UShort = 3u
    val twoMark: UShort = 4u
    val threeMark: UShort = 3u
    val fourMark: UShort = 5u

    val result = average(childrens, oneMark, twoMark, threeMark, fourMark)

    println(String.format("%.2f", result))
}


fun average(childrens: UShort, vararg args: UShort): Float {
    var sum: Int = 0
    args.forEach { value ->
       sum += value.toInt()
    }

    return sum.toFloat() / childrens.toFloat()
}
