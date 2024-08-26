package odevler.bolum02;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = Double.valueOf(input.next());

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter height in inches: ");

        double heightInInches = Double.valueOf(input2.next());

        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double metersIndex = Math.pow(heightInMeters, 2);
        double bmi = weightInKilograms / metersIndex;

        System.out.printf("BMI is: %.4f\n\n", bmi);

        input.close();
        input2.close();
    }
}
