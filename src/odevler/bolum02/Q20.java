package odevler.bolum02;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");

        double balance = Double.valueOf(input.next());

        double rate = Double.valueOf(input.next());

        double interest = balance * (rate / 1200);

        System.out.printf("The interest is %.5f\n\n", interest);

        input.close();

    }
}
