package odevler.bolum02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        System.out.print("Enter the radius and length of cylinder: ");
        Scanner input = new Scanner(System.in);

        double radius = Double.valueOf(input.next());
        double length = Double.valueOf(input.next());

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("Area of cylinder is: %.3f and volume of cylinder is: %.3f\n\n", area, volume);

        input.close();
    }
}
