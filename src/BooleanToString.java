public class BooleanToString {

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
