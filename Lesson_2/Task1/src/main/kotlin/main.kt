package ru.netology

import kotlin.math.roundToInt

fun main() {
    println("Введите сумму перевода в рублях: ")
    val amount: Int = readLine()!!.toInt()
    val commission = amount * 0.0075
    val result = if (commission > 35) commission.roundToInt() else 35
    println("Комиссия за перевод: $result руб.")
}
