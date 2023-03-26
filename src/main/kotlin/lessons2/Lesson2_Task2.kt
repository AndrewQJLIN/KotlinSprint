package lessons2

fun main() {

    var oldWorkers = 50
    var salaryOldWorkers = 30000

    var newStagers = 30
    var salaryNewStagers = 20000

    val sumSalaryOldWirkers = oldWorkers*salaryOldWorkers
    val totalSumSalary = sumSalaryOldWirkers + newStagers*salaryNewStagers

    val averageSalary = totalSumSalary / (oldWorkers+newStagers)

    println("Расходы на выплату зарплаты постоянных сотрудников: $sumSalaryOldWirkers рублей")
    println("Общие расходы по ЗП после прихода стажеров: $totalSumSalary рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary рублей")
}