package conditionalStatements;

import java.util.Scanner;

public class OvenClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int cookingMinute = scanner.nextInt();
        scanner.close();

        int totalMinute = hour * 60 + minute + cookingMinute;

        int finalHour = (totalMinute / 60) % 24;
        int finalMinute = totalMinute % 60;

        System.out.println(finalHour + " " + finalMinute);
    }

}
