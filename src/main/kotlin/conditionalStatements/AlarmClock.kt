package conditionalStatements

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var hour: Int = scanner.nextInt()
    var minute: Int = scanner.nextInt()
    scanner.close()

    if (minute >= 45) {
        minute -= 45
    } else {
        if (hour - 1 < 0) {
            hour = 23
        } else {
            hour -= 1
        }
        minute = minute + 60 - 45
    }
    println("$hour $minute")

}