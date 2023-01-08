package loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastLoopAPlusB {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < number; i++) {
            String string = bufferedReader.readLine();
            int target = string.indexOf(" ");
            int result = Integer.parseInt(string.substring(0, target)) + Integer.parseInt(string.substring(target + 1));
            stringBuilder.append(result).append("\n");
        }

        bufferedReader.close();
        System.out.print(stringBuilder);

    }

}
