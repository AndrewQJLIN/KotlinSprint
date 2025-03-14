package lesson2

import java.text.Format
import kotlin.math.pow

fun main() {
    val depositStartSum = 70_000
    val rate = 16.7
    val depositTime = 20

    val rateFormula = (1 + rate / 100)
    val depositSum = depositStartSum * rateFormula.pow(depositTime)

    println(String.format("%.3f", depositSum))
}