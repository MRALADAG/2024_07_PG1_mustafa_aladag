package odevler.bolum02;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        System.out.print("Enter the mass of water in kilograms: ");

        double initialTemperature;
        double finalTemperature;
        double weight;

        Scanner input = new Scanner(System.in);
        weight = Double.valueOf(input.next());

        System.out.print("\nEnter the initial temperature of the water in Celsius: ");

        Scanner input1 = new Scanner(System.in);
        initialTemperature = Double.valueOf(input1.next());

        System.out.print("\nEnter the final temperature of the water in Celsius: ");

        Scanner input2 = new Scanner(System.in);
        finalTemperature = Double.valueOf(input2.next());

        double energy = weight * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("\nThe energy needed is: $%.1f\n\n", energy);

        input.close();
        input1.close();
        input2.close();

    }
}
