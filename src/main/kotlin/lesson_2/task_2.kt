package org.example.lesson_2

fun main() {
    val employees:UShort = 50u
    val payEmployee:UShort = 30000u

    val interns:UShort = 30u
    val payIntern:UShort = 20000u

    val paysAllEmployees = employees * payEmployee
    println("Расходы на выплату зарплаты постоянных сотрудников: $paysAllEmployees")

    val paysAllInterns = interns * payIntern

    val allPays = paysAllEmployees + paysAllInterns
    println("Общие расходы по ЗП после прихода стажеров: $allPays")

    val averagePay = allPays / (employees + interns)
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averagePay")
}


