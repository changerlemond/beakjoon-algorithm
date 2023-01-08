package loop

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferReader = BufferedReader(InputStreamReader(System.`in`))
    val number: Int = bufferReader.readLine().toInt()
    val stringBuilder = StringBuilder()
    for (i in 0 until  number) {
        val string = bufferReader.readLine()
        val target = string.indexOf(" ")
        val result = string.substring(0, target).toInt() + string.substring(target + 1).toInt()
        stringBuilder.append(result).append("\n")
    }
    bufferReader.close()
    println(stringBuilder)
}