public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));

    }
    public static double convertToCentimeters(int height) {
        return height * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = feet * 12 + inches;

        return convertToCentimeters(totalInches);
    }
}
