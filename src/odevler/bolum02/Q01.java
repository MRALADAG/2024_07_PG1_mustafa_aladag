package odevler.bolum02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        double celsius;
        double fahrenheit;

        System.out.println("Enter degrees in Celsius: ");
        Scanner input = new Scanner(System.in);
        celsius = input.nextDouble();

        fahrenheit = (9.0 / 5.0 * celsius + 32);

        System.out.printf("Result of %f Celsius degree in Fhrenheit: %.3f", celsius, fahrenheit);

        input.close();

    }
}
