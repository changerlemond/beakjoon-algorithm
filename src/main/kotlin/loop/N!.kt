package loop

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    val number: Int = scanner.nextInt()
    var sum = 1

    for (i in 1..number) {
        sum *= i
    }

    println(sum)

}