package odevler.bolum02;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {

        System.out.println("Enter v0, v1, and t: ");
        double v0, v1, t;
        Scanner input = new Scanner(System.in);
        v0 = Double.valueOf(input.next());
        v1 = Double.valueOf(input.next());
        t = Double.valueOf(input.next());
        double a = (v1 - v0) / t;
        System.out.printf("The average acceleration is: $%.4f\n\n", a);

        input.close();
    }
}
