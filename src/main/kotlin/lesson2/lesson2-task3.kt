package lesson2

fun main() {
    val startHour = 9
    val startMinute = 39
    val travelTime: Int = 457

    val startTimeInMinutes = startHour * 60 + startMinute
    val endTimeInMinutes = startTimeInMinutes + travelTime

    val endHour = endTimeInMinutes / 60
    val endMinute = endTimeInMinutes % 60

    println("Отправление: $startHour:$startMinute")
    println("Прибытие   : $endHour:$endMinute")
}