package conditionalStatements

import java.util.Scanner
import kotlin.math.max

fun main() {
    val scanner = Scanner(System.`in`)
    val first: Int = scanner.nextInt()
    val second: Int = scanner.nextInt()
    val third: Int = scanner.nextInt()
    scanner.close()

    when {
        first == second && second == third -> println(10_000 + first * 1_000)
        first == second -> println(1_000 + first * 100)
        first == third -> println(1_000 + first * 100)
        second == third -> println(1_000 + second * 100)
        else -> println(max(first, max(second, third)) * 100)
    }
}