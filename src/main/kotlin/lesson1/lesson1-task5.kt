package lesson1

const val SECOND_IN_MINUTES = 60
const val MINUTES_IN_HOUR = 3600
fun main() {


    val secondOfTotal = 6480
    val hour = secondOfTotal / (MINUTES_IN_HOUR)
    val minutes = (secondOfTotal - hour * MINUTES_IN_HOUR) / SECOND_IN_MINUTES
    val second = secondOfTotal - (hour * MINUTES_IN_HOUR + minutes * SECOND_IN_MINUTES)

    println(String.format("%02d:%02d:%02d", hour, minutes, second))
}