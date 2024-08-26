package odevler.bolum02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter  monthly contribution: ");
        double monthlyAmount = Double.valueOf(input.next());
        double interestPerMonth = 0.05 / 12;
        double interestFactor = 1 + interestPerMonth;
        double deposit;

        double accountValue = monthlyAmount * interestFactor;
        deposit = accountValue + monthlyAmount;
        accountValue = deposit * interestFactor;
        deposit = accountValue + monthlyAmount;
        accountValue = deposit * interestFactor;
        deposit = accountValue + monthlyAmount;
        accountValue = deposit * interestFactor;
        deposit = accountValue + monthlyAmount;
        accountValue = deposit * interestFactor;
        deposit = accountValue + monthlyAmount;
        accountValue = deposit * interestFactor;

        System.out.printf("After the sixth month, the account value is %.3f", accountValue);

        input.close();
    }
}
