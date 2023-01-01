package conditionalStatements;

import java.util.Scanner;

public class PickQuadrant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > 0 && number2 > 0) {
            System.out.println("1");
        } else if (number1 < 0 && number2 > 0) {
            System.out.println("2");
        } else if (number1 < 0 && number2 < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }

}
