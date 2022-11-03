package ru.netology

fun main() {
    val secondsAgo = 172800
    val itemMinutes = secondsAgo / 60
    val itemHours = secondsAgo / 3600
    val text = printText (secondsAgo, itemMinutes, itemHours)
    println("был(а) $text")
}

fun printText(secondsAgo: Int, itemMinutes: Int, itemHours: Int ) = when {
    secondsAgo <= 60 -> "только что"
    secondsAgo <= (60 * 60) -> isMinutesAgo(itemMinutes)
    secondsAgo <= (24 * 60 * 60) -> isHoursAgo(itemHours)
    secondsAgo <= (48 * 60 * 60) -> "в сети вчера"
    secondsAgo <= (72 * 60 * 60) -> "в сети позавчера"
    else -> "в сети давно"
}

fun isMinutesAgo(itemMinutes: Int) = when {
    itemMinutes % 10 == 1 && (itemMinutes % 100) != 11 -> "в сети $itemMinutes минуту назад"
    itemMinutes % 10 in 2..4 -> "в сети $itemMinutes минуты назад"
    else -> "в сети $itemMinutes минут назад"
}

fun isHoursAgo(itemHours: Int) = when {
        itemHours % 10 == 1 && (itemHours % 100) != 11-> "в сети $itemHours час назад"
        itemHours % 10 in 2..4 -> "в сети $itemHours часа назад"
        else -> "в сети $itemHours часов назад"
    }











