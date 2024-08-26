package odevler.bolum02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        System.out.print("Enter the time zone offset to GMT: ");

        Scanner input = new Scanner(System.in);
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        currentHour += offset;

        System.out.printf("The current time is: %d:%d:%d .\n\n", currentHour, currentMinute, currentSecond);

        input.close();
    }
}
