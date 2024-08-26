package odevler.bolum02;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");

        double side = Double.valueOf(input.next());
        double operand = (3 * Math.pow(3, 0.5)) / 2;
        double area = operand * Math.pow(side, 2);

        System.out.printf("The distance between the two points is  %.4f\n\n", area);

        input.close();

    }
}
