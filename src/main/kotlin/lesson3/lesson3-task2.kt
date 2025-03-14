package lesson3

fun main() {
    var ageUser = 20
    var firstName = "Андреева"
    val secondName = "Татьяна"
    val fathersName = "Сергеевна"

    println("[$firstName $secondName $fathersName, $ageUser]")
    ageUser = 22
    firstName = "Сидорова"
    println("[$firstName $secondName $fathersName, $ageUser]")
}