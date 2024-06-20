package org.example.lesson_2

import kotlin.math.floor

const val TIME_OUT: Long = 10_000L
const val DIVISOR_PROCENT: Float = 100f

fun main() {
    var buff: Boolean = false
    val procent: Byte = 20

    var crystalOreWOBuff: Byte = 7
    var ironOreWOBuff: Byte = 11

    val startGame: Long = System.currentTimeMillis()

    while((System.currentTimeMillis() - startGame) < TIME_OUT) {
        buff = !buff

        if(buff){
            val crystalBuff: Byte = floor(crystalOreWOBuff * procent / DIVISOR_PROCENT).toInt().toByte()
            val ironBuff: Byte = floor(ironOreWOBuff * procent / DIVISOR_PROCENT) .toInt().toByte()

            crystalOreWOBuff = (crystalOreWOBuff + crystalBuff).toByte()
            ironOreWOBuff = (ironOreWOBuff + ironBuff).toByte()

            println("Iron buff: $ironBuff")
            println("Crystal buff: $crystalBuff")
            println()
        }

        Thread.sleep(1000L)
    }
}

