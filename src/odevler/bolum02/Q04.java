package odevler.bolum02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        System.out.print("Enter the number in pounds: ");
        Scanner input = new Scanner(System.in);

        double pound = Double.valueOf(input.next());

        double weight = pound * 0.454;

        System.out.printf("%.3f pound is: %.3f kilograms.\n\n", pound, weight);

        input.close();
    }
}
