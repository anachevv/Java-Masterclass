public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Please enter a valid time period!";
        }

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Please enter valid minutes!";
        } else if (!(seconds / 60 == minutes) && (seconds < 0 || seconds > 59)) {
            return "Please enter valid seconds!";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return String.format("%dh %dm %ds", hours, remainingMinutes, remainingSeconds);
    }
}
