public class Main {
    public static void main(String[] args) {
        double firstDouble = 20, secondDouble = 80;
        double result = ((firstDouble + secondDouble) * 100) % 40;
        boolean isResult = result == 0;

        System.out.printf("Result is: %b%n", isResult);

        if (!isResult) {
            System.out.println("got some remainder");
        } else {
            System.out.println("got no remainder");
        }

    }
}
