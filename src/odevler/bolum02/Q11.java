package odevler.bolum02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        System.out.print("Enter the number of years: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        int initialPopulation = 312032486;
        int totalDayOfYear = 365;
        int totalSecondOfHour = 3600;
        int totalSecondsOfEnteredYear = year * totalDayOfYear * 24 * totalSecondOfHour;

        // These values is that total number in five years.
        int numberOfBirth = totalSecondsOfEnteredYear / 7;
        int numberOfDeath = totalSecondsOfEnteredYear / 13;
        int numberOfImmigrant = totalSecondsOfEnteredYear / 45;

        int totalPopulation = initialPopulation + numberOfBirth + numberOfImmigrant - numberOfDeath;

        System.out.printf("numberOfDeath: %d ,\nnumberOfBirth: %d ,\nnumberOfImmigrant: %d\n", numberOfDeath, numberOfBirth, numberOfImmigrant);
        System.out.printf("Estimated total population of United Sates is %d in the next %d years.", totalPopulation, year);

        input.close();
    }
}
