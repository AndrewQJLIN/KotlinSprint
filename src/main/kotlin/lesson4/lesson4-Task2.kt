fun main() {

    val massGoodOne = 20
    val massGoodTwo = 50

    val volumeGoodOne = 80
    val volumeGoodTwo = 100

    println(
        "Груз с весом $massGoodOne кг и объемом $volumeGoodOne литров соответствует категории \"Average\":" +
                "${massGoodOne > WEIGHT_START && massGoodOne <= WEIGHT_END && volumeGoodOne < VOLUME_GOODS}"
    )
    println(
        "Груз с весом $massGoodTwo кг и объемом $volumeGoodTwo литров соответствует категории \"Average\":" +
                "${massGoodTwo > WEIGHT_START && massGoodTwo <= WEIGHT_END && volumeGoodTwo < VOLUME_GOODS}"
    )

}

const val WEIGHT_START = 35
const val WEIGHT_END = 100
const val VOLUME_GOODS = 100
