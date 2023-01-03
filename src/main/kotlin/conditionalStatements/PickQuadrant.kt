package conditionalStatements

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val x: Int = scanner.nextInt()
    val y: Int = scanner.nextInt()
    scanner.close()

    when {
        x > 0 && y > 0 -> println("1")
        x < 0 && y > 0 -> println("2")
        x < 0 && y < 0 -> println("3")
        x > 0 && y < 0 -> println("4")
    }

}