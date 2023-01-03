package conditionalStatements

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val year: Int = scanner.nextInt()
    scanner.close()

    when {
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) -> println("1")
        else -> println("0")
    }

}