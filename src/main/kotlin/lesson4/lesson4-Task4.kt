fun main() {
    val trainingDay = 5

    val isEven = trainingDay % 2 == 0

    print(
        String.format(
            "%-22s %b%n%-22s %b%n%-22s %b%n%-22s %b%n",
            "Упражнения для рук:",
            !isEven,
            "Упражнения для ног:",
            isEven,
            "Упражнения для спины:",
            isEven,
            "Упражнения для пресса:",
            !isEven
        )
    )

}