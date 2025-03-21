package lesson5

import kotlin.math.pow

fun main() {

    println("Введите массу тела в килограммах: ")
    val weight = readln().toDouble()
    println("Введите рост в сантиметрах: ")
    val length = readln().toDouble() / 100

    val imt = weight / length.pow(2)

    val result: String = when (imt) {
        in 0.0..<18.5 -> "Недостаточная масса тела"
        in 18.5..<25.0 -> "Нормальная масса тела"
        in 25.0..<30.0 -> "Избыточная масса тела"
        else -> {
            "Ожирение"
        }
    }
    println(String.format("Ваш ИМТ = %.2f $result", imt))
}