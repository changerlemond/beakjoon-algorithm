package conditionalStatements;

import java.util.Scanner;

public class TestScore {

    public static void main(String[] args) {
        // 1. Scanner
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        // 2. BufferedReader
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // int score2 = Integer.parseInt(bufferedReader.readLine());

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }

}
