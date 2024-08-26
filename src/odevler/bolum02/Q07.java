package odevler.bolum02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);

        final int minInHour = 60;
        final int hoursInDay = 24;
        final int daysInYear = 365;

        int resultInMin = input.nextInt();
        int resultInDays = ((resultInMin / minInHour) / hoursInDay) % daysInYear;
        int resultInYears = ((resultInMin / minInHour) / hoursInDay) / daysInYear;

        System.out.printf("%d minutes is approximately %d years and %d days.\n\n", resultInMin, resultInYears, resultInDays);

        input.close();
    }
}
