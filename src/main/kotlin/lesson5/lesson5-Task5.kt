package lesson5


fun main() {

    val gameNumbers = mutableSetOf<Int>()
    val gameAnswer = mutableSetOf<Int>()
    var inputAnswer: Int

    do {
        println(
            "Угадай три числа в диапазоне от $START_NUMBER_DATA до $END_NUMBER_DATA включительно\n" +
                    "Для завершения игры введите  -   -1 (минус один)"
        )
        while (gameNumbers.size != COUNT_OF_QUESTION) { gameNumbers.add((START_NUMBER_DATA..END_NUMBER_DATA).random()) }

        var position = 0
        do {
            val numberInString = when (position++) {
                0 -> "ПЕРВОЕ"
                1 -> "ВТОРОЕ"
                else -> "ТРЕТЬЕ"
            }
            println("Введите $numberInString число или -1 для выхода")
            inputAnswer = readln().toInt()
            gameAnswer.add(inputAnswer)
        } while (position < COUNT_OF_ANSWER && inputAnswer != -1)

        if (inputAnswer == -1) break

        val resultNumber = gameNumbers.intersect(gameAnswer)
        val resultWin = resultNumber.size


        print("\nЭти числа были загаданы: ")
        gameNumbers.forEach { print("$it ") }


        val outputText = when (resultWin) {
            1 -> {
                "Угадано одно число: $resultNumber! Вы выиграли утешительный приз!"
            }

            2 -> {
                "Поздравляем! Угадано 2 числа: $resultNumber! Выиграли крупный приз!"
            }

            3 -> {
                "Поздравляем! ДЖЕК ПОТ! Угаданы все числа!"
            }

            else -> "Неудача! Ни одно число не угадано. Крутите барабан!"
        }
        println("\nВаш результат: $outputText \n\n")

        gameNumbers.clear()
        gameAnswer.clear()
    } while (true)
    println("Игра окончена!")

}

const val START_NUMBER_DATA = 0
const val END_NUMBER_DATA = 42
const val COUNT_OF_ANSWER = 3
const val COUNT_OF_QUESTION = 3