package odevler.bolum02;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");

        double investmentAmount = Double.valueOf(input.next());

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter annual interest rate input percentage: ");
        double monthInterestRate = Double.valueOf(input2.next());

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        double years = input3.nextInt();

        years *= 12;
        monthInterestRate /= 1200; //Convert from yearly to monthly and from percent to decimal

        double futureInvestmentValue = investmentAmount * Math.pow(monthInterestRate + 1, years);

        System.out.printf("Accumulated value is %.2f\n\n", futureInvestmentValue);

        input.close();
        input2.close();
        input3.close();

    }
}
