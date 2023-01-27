package loop

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
//import java.util.Scanner
import java.util.StringTokenizer

fun main() {

//    1. Scanner
//    val scanner = Scanner(System.`in`)
//    val number: Int = scanner.nextInt()
//    scanner.close()
//
//    for (i in 1..number) {
//        println("*".repeat(i))
//    }

    // 2. BufferedReader
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    val stringTokenizer = StringTokenizer(bufferedReader.readLine())
    val bufferNumber: Int = stringTokenizer.nextToken().toInt()

    for (i in 1..bufferNumber) {
        bufferedWriter.write("${"*".repeat(i)}\n")
    }

    bufferedWriter.flush()
    bufferedReader.close()
    bufferedWriter.close()

}