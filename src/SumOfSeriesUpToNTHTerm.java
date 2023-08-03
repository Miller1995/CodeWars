import java.text.DecimalFormat;

public class SumOfSeriesUpToNTHTerm {
    /**
     * Task:
     * Your task is to write a function which returns the sum of following series upto nth term(parameter).
     * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
     * Rules:
     * You need to round the answer to 2 decimal places and return it as String.
     * If the given value is 0 then it should return 0.00
     * You will only be given Natural Numbers as arguments.
     * Examples:(Input --> Output)
     * 1 --> 1 --> "1.00"
     * 2 --> 1 + 1/4 --> "1.25"
     * 5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
     */

    public static void main(String[] args) {
        int i = 5;
        System.out.println(seriesSum(i));
    }

    public static String seriesSum(int number) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        float result = 0;
        if (number == 0) {
            return "0.00";
        } else {
            int i = 0;
            while (i < number) {
                result += 1.0 / (1 + i * 3);
                i++;
            }
            return String.valueOf(decimalFormat.format(result));
        }
    }
}
