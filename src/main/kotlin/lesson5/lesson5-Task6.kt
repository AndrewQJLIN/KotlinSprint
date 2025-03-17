package lesson5

import kotlin.math.pow

fun main() {

    println("Введите массу тела в килограммах: ")
    val weight = readln().toDouble()
    println("Введите рост в сантиметрах: ")
    val length = readln().toDouble() /100

    val imt = weight / length.pow(2)

    val result: String = if (imt < 18.5) {
        "Недостаточная масса тела"
    } else
        if (imt < 25) {
            "Нормальная масса тела"
        } else
            if (imt < 30) {
                "Избуточная масса тела"
            } else {
                "Ожирение"
            }
    println(String.format("Ваш ИМТ = %.2f $result",imt))
}