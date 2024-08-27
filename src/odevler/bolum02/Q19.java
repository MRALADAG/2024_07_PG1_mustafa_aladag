package odevler.bolum02;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");

        double x1 = Double.valueOf(input.next());
        double y1 = Double.valueOf(input.next());
        double x2 = Double.valueOf(input.next());
        double y2 = Double.valueOf(input.next());
        double x3 = Double.valueOf(input.next());
        double y3 = Double.valueOf(input.next());


        double s1 = Math.pow((Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)), 0.5);
        double s2 = Math.pow((Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)), 0.5);
        double s3 = Math.pow((Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)), 0.5);

        double s = (s1 + s2 + s3) / 2;

        double area = Math.sqrt((s * (s - s1) * (s - s2) * (s - s3)));

        System.out.printf("The area of the triangle is %.1f\n\n", area);

        input.close();

    }
}
