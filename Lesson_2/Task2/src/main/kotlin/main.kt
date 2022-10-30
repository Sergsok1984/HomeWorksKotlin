package ru.netology

fun main() {
    println("Введите количество лайков: ")
    val likes :Int = readLine()!!.toInt()
    val result = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $result.")
}