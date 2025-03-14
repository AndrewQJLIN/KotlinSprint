package lesson2

fun main() {
    val oldWorkers = 50
    val salaryOldWorkers = 30000

    val newStages = 30
    val salaryStages = 20000

    val oldStaffSalary = oldWorkers * salaryOldWorkers
    val totalSalary = oldStaffSalary + newStages * salaryStages
    val averageSalary = totalSalary / (oldWorkers + newStages)

    println("Расходы на выплату зарплаты постоянных сотрудников: $oldStaffSalary рублей")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalary рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary рублей")
}