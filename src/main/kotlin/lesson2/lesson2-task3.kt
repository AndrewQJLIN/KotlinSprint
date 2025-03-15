package lesson2

const val MINUTES_IN_HOUR = 60
fun main() {
    val startHour = 9
    val startMinute = 39
    val travelTime: Int = 457

    val startTimeInMinutes = startHour * MINUTES_IN_HOUR + startMinute
    val endTimeInMinutes = startTimeInMinutes + travelTime

    val endHour = endTimeInMinutes / MINUTES_IN_HOUR
    val endMinute = endTimeInMinutes % MINUTES_IN_HOUR

    println("Отправление: $startHour:$startMinute")
    println("Прибытие   : $endHour:$endMinute")
}