package odevler.bolum01;

public class Q07 {
    public static void main(String[] args) {
        double coefficient = 1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11;
        double pi = 4 * coefficient;
        double extendedPi = 4 * (coefficient + 1.0 / 13);
        System.out.println("pi: " + pi + "\nextendedPi: " + extendedPi);
    }
}
