package loop

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
// import java.util.Scanner
import java.util.StringTokenizer

fun main() {

//     1. Scanner
//    val scanner = Scanner(System.`in`)
//
//    while (scanner.hasNextInt()) {
//        val numberA: Int = scanner.nextInt()
//        val numberB: Int = scanner.nextInt()
//        println("${numberA + numberB}")
//    }

//    scanner.close()

    // 2. BufferedReader, BufferedWriter
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val bufferedWriter = BufferedWriter(OutputStreamWriter(System.out))

    var string: String?

    while (bufferedReader.readLine().also { string = it } != null) {
        val stringTokenizer = StringTokenizer(string)
        val numberA: Int = stringTokenizer.nextToken().toInt()
        val numberB: Int = stringTokenizer.nextToken().toInt()
        bufferedWriter.write("${numberA + numberB}\n")
    }

    bufferedWriter.flush()
    bufferedReader.close()
    bufferedWriter.close()

}