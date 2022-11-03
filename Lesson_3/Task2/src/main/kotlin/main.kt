package ru.netology

fun main() {
    val commission = calcCommission("VK Pay", 0, 10000)
    println("Комиссия за перевод: $commission руб.")
}

fun calcCommission(typeCard: String, amountMonth: Int, amountTransfer: Int ) = when (typeCard) {
        "MasterCard/Maestro" -> {
            if ((amountMonth + amountTransfer) < 75000) 0
            else (amountTransfer * 0.006 + 20).toInt()
        }
        "Visa/Mir" -> {
            if ((amountTransfer * 0.0075) < 35) 35
            else (amountTransfer * 0.0075).toInt()
        } else -> 0
    }



