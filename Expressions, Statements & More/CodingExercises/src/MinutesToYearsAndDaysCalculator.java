public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);  // → should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // → should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600); // → should print "561600 min = 1 y and 25 d"
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int years, days;

            years = (int) (minutes / (365 * 24 * 60));
            days = (int) (minutes / (24 * 60) % 365);

            System.out.format("%d min = %d y and %d d\n", minutes, years, days);
        }
    }
}
