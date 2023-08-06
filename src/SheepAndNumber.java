import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SheepAndNumber {
    /**
     * If you can't sleep, just count sheep!!
     * Task:
     * Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
     * Input will always be valid, i.e. no negative integers.
     */

    public static void main(String[] args) {
        int number = 3;
        System.out.println(count(number));
    }

    public static String count(int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= number; i++)
            builder.append(i).append(" sheep...");
        return builder.toString();
    }

    public static String countV2(int number) {
        String text = " sheep...";
        String result = "";
        for (int i = 1; i <= number; i++) {
            result += i + text;
        }
        return result;
    }

    public static String countV3(int num) {
        return IntStream.range(1, num + 1)
                .mapToObj(n -> "" + n + " sheep...")
                .collect(Collectors.joining(""));
    }
}