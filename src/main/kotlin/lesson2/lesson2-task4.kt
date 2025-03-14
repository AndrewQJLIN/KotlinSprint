package lesson2

fun main() {
    val cristalOre: Int = 7
    val metalOre: Int = 11

    val buff = 20

    val cristalBuff = cristalOre * buff / 100
    val metalBuff = metalOre * buff / 100

    println("Amount cristal of buff - $cristalBuff")
    println("Amount metal of buff - $metalBuff")
}