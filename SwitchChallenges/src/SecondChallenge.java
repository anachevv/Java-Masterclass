public class SecondChallenge {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(7));
    }
    public static String printDayOfWeek(int userInput) {
        String message = "";

        switch (userInput) {
            case 0 -> message = "Sunday";
            case 1 -> message = "Monday";
            case 2 -> message = "Tuesday";
            case 3 -> message = "Wednesday";
            case 4 -> message = "Thursday";
            case 5 -> message = "Friday";
            case 6 -> message = "Saturday";
            default -> message = "Invalid Day";
        }
        return message;
    }
}
