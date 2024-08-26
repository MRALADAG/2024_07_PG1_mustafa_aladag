package odevler.bolum02;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");

        double speed = Double.valueOf(input.next());
        double acceleration = Double.valueOf(input.next());
        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.printf("The minimum runway length for this airplane is %.3f", length);

        input.close();
    }
}
