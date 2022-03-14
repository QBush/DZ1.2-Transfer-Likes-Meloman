package ru.netology

var previousSum = 10_000__00
var currentSum = 2_000_00
var buyingCountForLast3Month = 3
val procentDiscount = 0.05
val melomanDiscount = 0.01

fun main() {

    var discount = 0
    if (previousSum in 1_001_00..10_000_00) discount = 100_00
    if (previousSum > 10_000__00) discount = (currentSum * procentDiscount).toInt()

    val resultSum = if (isThisMeloman(buyingCountForLast3Month))
        ((currentSum - discount) * (1 - melomanDiscount)).toInt()
    else currentSum - discount
    println("Сумма покупки: ${resultSum / 100}руб.${resultSum % 100}коп.")

    previousSum = resultSum
}

fun isThisMeloman(buyingCountForLast3Month: Int): Boolean {
    return buyingCountForLast3Month >= 3
}