public class LeapYearCalculator {
    public static void main(String[] args) {
        isLeapYear(-1600); //→ should return false since the parameter is not in range (1-9999)

        isLeapYear(1600); //→ should return true since 1600 is a leap year

        isLeapYear(2017); //→ should return false since 2017 is not a leap year

        isLeapYear(2000);  //→ should return true because 2000 is a leap year
    }
    public static boolean isLeapYear(int years) {
        if (years < 1 || years > 9999) {
            return false;
        } else {
            if ((years % 4 == 0 && years % 100 != 0) || years % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}