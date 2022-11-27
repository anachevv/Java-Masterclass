public class PoundsToKilograms {
    public static void main(String[] args) {
        double pounds = 200d;
        final double toKilogram = 0.45359237d;
        double kilograms = pounds * toKilogram;

        System.out.printf("%.2f pounds => %.4f kilograms.", pounds, kilograms);
    }
}
