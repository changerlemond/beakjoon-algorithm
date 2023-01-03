package conditionalStatements

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val hour = scanner.nextInt()
    val minute = scanner.nextInt()
    val cookingMinute = scanner.nextInt()
    scanner.close()

    val totalMinute = hour * 60 + minute + cookingMinute

    val finalHour = (totalMinute / 60) % 24
    val finalMinute = totalMinute % 60

    println("$finalHour $finalMinute")

}