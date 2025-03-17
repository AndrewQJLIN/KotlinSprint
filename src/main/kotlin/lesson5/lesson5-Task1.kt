import kotlin.random.Random

fun main() {

    println("Вы не бот?\nРешите пример и введите правильный ответ:")
    val a = Random.nextInt(0, 100)
    val b = Random.nextInt(0, 100)
    print("$a + $b = ")
    val answer = readln().toInt()

    if (answer == (a + b)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}