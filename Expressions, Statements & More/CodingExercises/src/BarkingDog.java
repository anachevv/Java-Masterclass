public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp (true, 22);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("false");
            return false;
        }
        if (hourOfDay < 8 || hourOfDay > 22) {
            System.out.println(barking);
            return barking;
        }
        return false;
    }
}