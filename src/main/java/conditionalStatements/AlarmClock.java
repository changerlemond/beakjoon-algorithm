package conditionalStatements;

import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        scanner.close();

        if (minute >= 45) {
            minute = minute - 45;
        } else {
            if (hour <= 0) {
                hour = 23;
            } else {
                hour = hour - 1;
            }
            minute = minute + 60 - 45;
        }
        System.out.println(hour + " " + minute);
    }

}
