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
//
//    while (true) {
//        val numberA: Int = scanner.nextInt()
//        val numberB: Int = scanner.nextInt()
//
//        if (numberA == 0 && numberB == 0) {
//            break
//        }
//        println("${numberA + numberB}")
//    }

    // 2. BufferedReader, BufferedWriter 이용
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val stringTokenizer = StringTokenizer(bufferedReader.readLine())
        val numberA: Int = stringTokenizer.nextToken().toInt()
        val numberB: Int = stringTokenizer.nextToken().toInt()

        if (numberA == 0 && numberB == 0) {
            break
        } else {
            bufferedWriter.write((numberA + numberB).toString() + "\n")
        }
    }

    bufferedWriter.flush()
    bufferedReader.close()
    bufferedWriter.close()

}