package conditionalStatements

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val numberN: Long = scanner.nextLong()
    val numberM: Long = scanner.nextLong()
    scanner.close()

    if (numberN < numberM) {
        println(-(numberN - numberM))
    } else {
        println(numberN - numberM)
    }

}