package loop

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val number: Int = scanner.nextInt()

    for (i in 1..number) {
        val a: Int = scanner.nextInt()
        val b: Int = scanner.nextInt()
        println(a + b)
    }

    scanner.close()
}