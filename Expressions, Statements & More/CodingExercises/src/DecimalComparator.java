import java.math.RoundingMode;
import java.text.DecimalFormat;


public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //→ should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //→ should return false since numbers are not equal up to 3 decimal places

        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); //→ should return true since numbers are equal up to 3 decimal places.
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        DecimalFormat df1 = new DecimalFormat("#.###");
        DecimalFormat df2 = new DecimalFormat("#.###");

        df1.setRoundingMode(RoundingMode.DOWN);
        df2.setRoundingMode(RoundingMode.DOWN);

        boolean result = df1.format(x).equals(df2.format(y));

        return result;
    }
}
