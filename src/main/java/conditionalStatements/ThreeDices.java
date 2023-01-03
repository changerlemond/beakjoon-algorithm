package conditionalStatements;

import java.util.Scanner;

public class ThreeDices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        scanner.close();

        if (first == second && first == third) {
            System.out.println(10_000 + first * 1_000);
        } else if (first == second) {
            System.out.println(1_000 + first * 100);
        } else if (first == third) {
            System.out.println(1_000 + first * 100);
        } else if (second == third) {
            System.out.println(1_000 + second * 100);
        } else {
            System.out.println(Math.max(first, Math.max(second, third)) * 100);
        }
    }

}
