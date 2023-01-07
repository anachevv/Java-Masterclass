public class SecondChallenge {
    public static void main(String[] args) {
        System.out.println(printDayOfWeek(1));
    }
    public static String printDayOfWeek(int userInput) {
        return switch (userInput) {
            case 0 -> {yield "Sunday";}
            case 1 -> {yield "Monday";}
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}
            default -> {yield "Invalid Day";}
        };
    }
}
