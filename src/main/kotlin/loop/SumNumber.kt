package loop

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val number: Int = scanner.nextInt()
    scanner.close()

    var sum = 0
    for (i in 1..number) {
        sum += i
    }

    println(sum)

}