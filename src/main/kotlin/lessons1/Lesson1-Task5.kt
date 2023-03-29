package lessons1

fun main() {
    val second = 6480
    val minutes = second / 60
    val secOfEnd = second % 60

//    if (secOfEnd == 0) {
//        println("$minutes:00")
//        return
//    }
//
//    if (secOfEnd < 10) {
//        println("$minutes:0$secOfEnd")
//    } else {
//        println("$minutes:$secOfEnd")
//    }

    println(String.format("%d:%02d",minutes,secOfEnd))
}