package odevler.bolum02;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter dollar amount as an integer whose last two digits represent the cents: ");

        int amount = input.nextInt();

        int cents = amount % 100;
        int dollars = amount / 100;

        System.out.printf("The input %d represents %d dollars and %d cents.\n", amount, dollars, cents);
        System.out.printf("$%d.%d\n\n", dollars, cents);

        input.close();

    }
}
