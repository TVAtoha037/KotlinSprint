package org.example.lesson_2

fun main() {
    var buff = false

    var crystalOreWOBuff: Float = 7f
    var ironOreWOBuff: Float = 11f

    val startGame = System.currentTimeMillis()

    while((System.currentTimeMillis() - startGame) < 10_000L) {
        buff = !buff

        if(buff){
            val crystalBuff = crystalOreWOBuff * 0.2f
            val ironBuff = ironOreWOBuff * 0.2f

            crystalOreWOBuff += crystalBuff
            ironOreWOBuff += ironBuff

            println("Iron buff: $ironBuff")
            println("Crystal buff: $crystalBuff")
            println()
        }

        Thread.sleep(1000L)
    }
}

