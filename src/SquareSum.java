import java.util.Arrays;

public class SquareSum {

    /**
     * Complete the square sum function so that it squares each number passed into it and then sums the results together.
     * <p>
     * For example, for [1, 2, 2] it should return 9 because
     * 1^2 + 2^2 + 2^2 = 9
     */

    public static void main(String[] args) {
        int numbers[] = {1, 2, 2};
        int numbers2[] = {5, -3, 4};

        System.out.println(squareSum(numbers2));
    }

    public static int squareSum(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += (int) Math.pow(n[i], 2);
        }
        return sum;
    }

    public static int squareSumV2(int[] n) {
        int sum = 0;
        for (int number : n) {
            sum += number * number;
        }
        return sum;
    }

    public static int squareSumV3(int[] n) {
        return Arrays.stream(n).map(x -> x * x).sum();
    }
}
