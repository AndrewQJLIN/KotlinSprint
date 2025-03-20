fun main() {

    println("Есть ли провреждения корпуса (напишите)?\nfalse - если НЕТ повреждений\ntrue - если ДА, ЕСТЬ повреждения")
    val isDamageShip = readln().toBoolean()
    println("Введите численность экипажа (число):")
    val crewSize = readln().toInt()
    println("Введите число ящиков провизии (число):")
    val provisionBoxes = readln().toInt()
    println("Благоприятна ли погода (напишите)?\nfalse - если НЕТ, погода НЕ благоприятная\ntrue - если ДА, погода благоприятная")
    val isWeatherIsGood = readln().toBoolean()

    val isReadyToStart =
        ((!isDamageShip && (crewSize >= MINIMUM_CREW_SIZE && crewSize < MAXIMUM_CREW_SIZE)) ||
                (crewSize == MAXIMUM_CREW_SIZE && isWeatherIsGood))
                &&
                provisionBoxes > MINIMUM_PROVISION_BOXES

    println("При введенных данных отправка корабля: $isReadyToStart")
}

const val MINIMUM_CREW_SIZE = 55
const val MAXIMUM_CREW_SIZE = 70
const val MINIMUM_PROVISION_BOXES = 50