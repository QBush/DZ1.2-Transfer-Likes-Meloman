package ru.netology


fun main() {

    val likesCount = 121
    likesCountVariant(likesCount)

}


fun likesCountVariant(likesCount: Int) {
    if (likesCount == 0) print("Ваш лайк будет первым!")
    else if (likesCount == 1000 || likesCount % 1000 == 0) println("Понравилось $likesCount людей")

    else if (likesCount == 1 || (likesCount % 10 == 1 && likesCount !=11)) println("Понравилось $likesCount человеку")
    else println("Понравилось $likesCount людям")

}