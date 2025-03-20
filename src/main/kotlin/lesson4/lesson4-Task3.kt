fun main() {

    val isSunny = true
    val isAwningOpen = true
    val humidityValue = 20
    val seasonCurrent = "ЗИМА"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? ${
            (isSunny == IS_SUNNY)
                    && (isAwningOpen == IS_AWNING_OPEN)
                    && (humidityValue == HUMIDITY_IN_PERCENT)
                    && seasonCurrent != INCORRECT_SEASON
        }"
    )
}

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY_IN_PERCENT = 20
const val INCORRECT_SEASON = "ЗИМА"