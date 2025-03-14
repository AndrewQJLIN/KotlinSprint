package lesson1

const val SECOND_IN_MINUTES = 60
const val SECOND_IN_HOUR = SECOND_IN_MINUTES* SECOND_IN_MINUTES
fun main() {


    val secondOfTotal = 6480
    val hour = secondOfTotal / (SECOND_IN_HOUR)
    val minutes = (secondOfTotal - hour * SECOND_IN_HOUR) / SECOND_IN_MINUTES
    val second = secondOfTotal - (hour * SECOND_IN_HOUR + minutes * SECOND_IN_MINUTES)

    println(String.format("%02d:%02d:%02d", hour, minutes, second))
}