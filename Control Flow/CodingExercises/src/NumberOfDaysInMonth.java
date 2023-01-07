public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020)); // → should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020)); // → should return 29 since February has 29 days in a leap year and 2020 is a leap year.

        System.out.println(getDaysInMonth(2, 2018)); // → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.

        System.out.println(getDaysInMonth(-1, 2020)); // → should return -1 since the parameter month is invalid.

        System.out.println(getDaysInMonth(1, -2020)); // → should return -1 since the parameter year is outside the range of 1 to 9999.
    }
    public static boolean isLeapYear(int year) {
        if (!(year >= 1 && year <= 9999)) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        boolean yearIsLeap = isLeapYear(year);

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        int result = 0;
        switch (month) {

            case 1:
                result = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    result = 29;
                } else {
                    result = 28;
                }
                break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;
        }
        return result;
    }
}
