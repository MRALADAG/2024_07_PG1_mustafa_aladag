package odevler.bolum01;

public class Q11 {
    public static void main(String[] args) {
        /*
        her 7 saniyede 1 doğum
        her 13 saniyede 1 ölüm
        her 45 saniyede 1 göçmen
        başlangıçtaki nüfus sayası = 312032486
        gelecek 5 yıl içindeki nüfus dağılımı

        1 yıl için 365 gün

        5 yıl içindeki doğum = 5 * 365 * 24 * 3600 / 7;

        5 yıl içindeki ölüm = 5 * 365 * 24 * 3600 / 13;

        5 yıl içindeki göçmen = 5 * 365 * 24 * 3600 / 45;

        toplam nüfus sayısı = nüfus sayası + doğum + göçmen - ölüm;

        */

        int initialPopulation = 312032486;
        int totalDayOfYear = 365;
        int totalSecondOfDay = 3600;
        int totalSecondsOfFiveYear = 5 * totalDayOfYear * 24 * totalSecondOfDay;

        // These values is that total number in five years.
        int numberOfBirth = (5 * totalDayOfYear * 24 * totalSecondOfDay) / 7;
        int numberOfDeath = (5 * totalDayOfYear * 24 * totalSecondOfDay) / 13;
        int numberOfImmigrant = (5 * totalDayOfYear * 24 * totalSecondOfDay) / 45;

        int totalPopulation = initialPopulation + numberOfBirth + numberOfImmigrant - numberOfDeath;

        System.out.printf("numberOfDeath: %d ,\nnumberOfBirth: %d ,\nnumberOfImmigrant: %d\n", numberOfDeath, numberOfBirth, numberOfImmigrant);
        System.out.printf("Estimated total population of United Sates is %d in the next five years.", totalPopulation);
    }
}
