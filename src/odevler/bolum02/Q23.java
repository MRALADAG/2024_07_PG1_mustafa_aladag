package odevler.bolum02;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        /*Enter the driving distance: 900.5
        Enter miles per gallon: 25.5
        Enter price per gallon: 3.55
        The cost of driving is $125.36*/

        double distance;
        double milesPerGallon;
        double pricePerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance in miles:");

        distance = Double.valueOf(input.next());

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the miles per gallon:");

        milesPerGallon = Double.valueOf(input2.next());

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the price of gas per gallon:");

        pricePerGallon = Double.valueOf(input3.next());

        double costOfDriving = distance / milesPerGallon * pricePerGallon;

        System.out.printf("The cost of driving is $%.2f\n\n", costOfDriving);

        input.close();
        input2.close();
        input3.close();

    }
}
