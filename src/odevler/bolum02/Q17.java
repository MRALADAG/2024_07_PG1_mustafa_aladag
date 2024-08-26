package odevler.bolum02;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");

        double temp = Double.valueOf(input.next());

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        Scanner input2 = new Scanner(System.in);

        int windSpeed = input2.nextInt();
        double vToPow16 = Math.pow(windSpeed, 0.16);

        double twc = 35.74 + 0.6215 * temp - 35.75 * vToPow16 + 0.4275 * temp * vToPow16;

        System.out.printf("The wind chill index is %.5f\n\n", twc);

        input.close();
        input2.close();
    }
}
