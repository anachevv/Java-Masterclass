public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(0);
        checkNumber(-111);
    }

    public static void checkNumber(int number) {
        String message = number > 0 ? "positive" : number < 0 ? "negative" : "zero";
        System.out.println(message);
    }
}
