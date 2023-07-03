public class BooleanToString {
    /**
     * Implement a function which convert the given boolean value into its string representation.
     * Note: Only valid inputs will be given.
     */

    public static void main(String[] args) {
        boolean b = true;
        System.out.println(convert(b));

    }

    public static String convert(boolean b) {
        if (b)
            return "true";
        else
            return "false";
    }
}
