package odevler.bolum01;

public class Q12 {
    public static void main(String[] args) {
        double totalHour = (1 * 3600 + 40 * 60 + 35) / 3600;
        double distance = 24 * 1.6;
        double velocity = distance / totalHour;
        System.out.printf("Avarage speed is : %.3f", velocity);
    }
}
