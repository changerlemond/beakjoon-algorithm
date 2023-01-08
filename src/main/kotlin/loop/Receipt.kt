package loop

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val total: Int = scanner.nextInt()
    val number: Int = scanner.nextInt()

    var sum = 0
    for (i in 1..number) {
        val a: Int = scanner.nextInt()
        val b: Int = scanner.nextInt()
        sum += a * b
    }

    scanner.close()

    if (total == sum) {
        println("Yes")
    } else {
        println("No")
    }

}