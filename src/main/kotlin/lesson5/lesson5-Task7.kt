package lesson5

fun main() {

    println("Введите расстояние поездки (в километрах): ")
    val pathLenght = readln().toDouble()
    println("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toDouble()
    println("Введите цену за литр топлива (в рублях): ")
    val fuelPrice = readln().toDouble()

    val totalFuelRequired = (pathLenght * fuelConsumption) / 100
    val costOfFuel = totalFuelRequired * fuelPrice

    println(
        String.format(
            "Для данной поездки необходимо топлива - %.2f л.\n" +
                    "Общая стоимость поездки составит - %.2f руб.", totalFuelRequired, costOfFuel
        )
    )
}