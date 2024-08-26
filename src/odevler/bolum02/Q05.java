package odevler.bolum02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        System.out.print("Enter the subtotal and a gratuity rate: ");
        Scanner input = new Scanner(System.in);

        double subTotal = Double.valueOf(input.next());
        double gratuityRate = Double.valueOf(input.next());

        double gratuity = subTotal * (gratuityRate / 100);
        double total = subTotal + gratuity;

        System.out.printf("The gratuity is $%.3f and total is $%.3f\n\n", gratuity, total);

        input.close();
    }
}
