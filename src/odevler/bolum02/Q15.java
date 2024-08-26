package odevler.bolum02;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        double x1, x2, y1, y2;

        System.out.println("Enter x1 and y1: ");
        x1 = Double.valueOf(input.next());
        y1 = Double.valueOf(input.next());


        System.out.println("Enter x2 and y2: ");
        x2 = Double.valueOf(input2.next());
        y2 = Double.valueOf(input2.next());
        double xAxis = Math.pow((x2 - x1), 2);
        double yAxis = Math.pow((y2 - y1), 2);
        double a = Math.pow((xAxis + yAxis), 0.5);

        System.out.printf("The distance between the two points is  %.15f\n\n", a);

        input.close();
        input2.close();
    }
}
