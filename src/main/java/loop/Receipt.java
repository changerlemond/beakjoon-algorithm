package loop;

import java.util.Scanner;

public class Receipt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            sum += a * b;
        }

        scanner.close();

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
