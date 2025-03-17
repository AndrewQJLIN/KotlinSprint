package lesson5
fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    println("Введите имя пользователя для входа в систему: ")
    val textOut = if (readln().trim() != userName) {
        "Пользователь с таким именем не найден! ЯПожалуйста, зарегистрируйтесь"
    } else {
        println("Привет, $userName")
        println("Введите Ваш пароль:")
        if (readln() != userPassword) {
            "Отказ в авторизации"
        } else "Вы успешно авторизованы!"
    }
    println(textOut)
}