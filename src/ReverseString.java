import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    /**
     * Complete the function that accepts a string parameter, and reverses each word in the string.
     * All spaces in the string should be retained.
     * Examples
     * "This is an example!" ==> "sihT si na !elpmaxe"
     * "double  spaces"      ==> "elbuod  secaps"
     */

    public static void main(String[] args) {
        String str = "              ";
        System.out.println(reverseStringV2(str));
    }

    public static String reverseString(String str) {
        return str.trim().isEmpty() ? str : Stream.of(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseStringV2(String str) {
        String[] strings = str.split(" ");
        StringBuilder builder = new StringBuilder();

        if (strings.length == 0)
            return str;
        else {
            for (int i = strings.length - 1; i >= 0; i--) {
                builder.append(" ").append(strings[i]);
            }
            return builder.reverse().deleteCharAt(builder.length() - 1).toString();
        }
    }

    public static String reverseStringV3(String str) {
        return Arrays.stream(str.split("(?<=\\s)|(?=\\s+)"))
                .map(s -> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining());
    }
}
