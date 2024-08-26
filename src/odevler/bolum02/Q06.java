package odevler.bolum02;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int unitsDigit = number % 10;
        int tensDigit = (number % 100) / 10;
        int hundredsDigit = (number % 1000) / 100;

        int sumOfDigits = unitsDigit + tensDigit + hundredsDigit;

        System.out.printf("The sum of the digits is %d\n\n", sumOfDigits);

        input.close();
    }
}
