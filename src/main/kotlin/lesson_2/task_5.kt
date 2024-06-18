package org.example.lesson_2

import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val contribution: Int = 70_000
    val interestRate: Float = 16.7f
    val years: Int = 20


    val dd = floor((1f + interestRate / 100.0) * 1000.0) / 1000.0 // получение double без лишних значений

    val amount = contribution * dd.pow(years)

    println("Размер вклада через $years лет составит ${String.format("%.3f", amount)} рублей.")
}



