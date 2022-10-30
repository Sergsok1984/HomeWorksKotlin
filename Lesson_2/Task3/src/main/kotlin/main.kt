package ru.netology

fun main() {
    println("Введите сумму покупки в рублях: ")
    val amount: Int = readLine()!!.toInt()
    println("Введите тип покупателя (0 - непостоянный, 1 - постоянный): ")
    val typeClient: Int = readLine()!!.toInt()
    val meloman: Boolean = typeClient == 1
    val result = if (amount > 1000 && amount <= 10000) amount - 100
    else {
        if (amount > 10000) (amount * 0.95).toInt()
        else amount
    }
    val totalAmount = if (meloman) (result * 0.99).toInt() else result
    print("Сумма к оплате с учетом скидки: $totalAmount руб.")
}
