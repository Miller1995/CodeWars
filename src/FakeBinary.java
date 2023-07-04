
public class FakeBinary {
    /**
     * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
     * Return the resulting string.
     * Note: input will never be an empty string
     */

    public static void main(String[] args) {
        String number = "383";
        fake(number);
        fake1(number);
    }

    public static String fake(String str) {
        char[] result = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (result[i] < '5') {
                result[i] = '0';
            } else
                result[i] = '1';
        }
        String temp = String.valueOf(result);
        return temp;
    }

    public static String fake1(String str) {
        String result = str.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
        return result;
    }
}
