package conditionalStatements

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val score = scanner.nextInt()
    scanner.close()

    when {
        score >= 90 -> println("A")
        score >= 80 -> println("B")
        score >= 70 -> println("C")
        score >= 60 -> println("D")
        else -> println("F")
    }

}