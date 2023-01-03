package conditionalStatements

import java.lang.System
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    scanner.close()

    when {
        a > b -> println(">")
        a < b -> println("<")
        else -> println("==")
    }

}