package loop

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val number: Int = scanner.nextInt()
    scanner.close()

    for (i in 1..9) {
        println("$number * $i = ${number * i}")
    }

}