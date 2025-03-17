fun main() {

    val isSunny = true
    val tentOpen = true
    val humidityValue = 20
    val seasonCurrent = "ЗИМА"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(isSunny==NEED_SUNNY)
            && (tentOpen==TENT_OPEN) 
            && (humidityValue == HUMIDITY_IN_PERCENT) 
            && seasonCurrent != INCORRECT_SEASON}")

}

const val NEED_SUNNY = true
const val TENT_OPEN = true
const val HUMIDITY_IN_PERCENT = 20
const val INCORRECT_SEASON = "ЗИМА"