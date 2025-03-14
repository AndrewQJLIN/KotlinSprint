package lesson1

fun main() {
    val secondOfTotal = 6480
    val hour = secondOfTotal/3600
    val minutes = (secondOfTotal - hour*3600)/60
    val second = secondOfTotal - (hour*3600 + minutes*60)

    println(String.format("%02d:%02d:%02d",hour,minutes,second))
}