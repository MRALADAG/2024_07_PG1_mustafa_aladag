package odevler.bolum02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        System.out.print("Enter the number in feet: ");
        Scanner input = new Scanner(System.in);

        double feet = Double.valueOf(input.next());

        double length = feet * 0.305;

        System.out.printf("%.3f feet is: %.3f meter.\n\n", feet, length);

        input.close();

    }
}
