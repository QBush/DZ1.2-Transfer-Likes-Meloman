package ru.netology


val amount = 1000__00
val minComission = 35__00
val standartComission = 0.0075

fun main() {
    val resultComission =
        if (amount * standartComission > minComission) (amount * standartComission).toInt() else minComission
    println("Comission: ${resultComission / 100} руб. ${resultComission % 100} коп.")
}




