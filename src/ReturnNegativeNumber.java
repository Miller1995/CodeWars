import static java.lang.Math.abs;

public class ReturnNegativeNumber {
    /**
     * In this simple assignment you are given a number and have to make it negative.
     * But maybe the number is already negative?
     * The number can be negative already, in which case no change is required.
     * Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
     * Examples
     * Kata.makeNegative(1);  // return -1
     * Kata.makeNegative(-5); // return -5
     * Kata.makeNegative(0);  // return 0
     */

    public static void main(String[] args) {
        int number = 7;
        makeNegative(number);
        System.out.println(makeNegativeV2(number));

    }

    public static int makeNegative(final int x) {
        if (x <= 0)
            return x;
        else
            return -x;
    }

    public static int makeNegativeV2(final int x) {
        return x <= 0 ? x : -x;
    }

    public static int makeNegativeV3(final int x) {
        return -abs(x);
    }
}
