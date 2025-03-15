package lesson3

fun main() {
    val playerMove = "D2-D4;0"

    val arrayData = playerMove.split("-",";")

    val startMove = arrayData[0]
    val endMove = arrayData[1]
    val countMove = arrayData[2]



    println("Ход игрока номер: $countMove")
    println("Фигура перемещается с клетки: $startMove")
    println("на клетку: $endMove")
}