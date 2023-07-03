public class ValidatePIN {
    public static void main(String[] args) {
        String str = "000000";
        System.out.println(validate(str));

    }

    public static boolean validate(String str) {

        if (((str.length() == 4) || (str.length() == 6)) && str.matches("^(\\d{4}|\\d{6})$")) {
            return true;
        } else {
            return false;
        }
    }
}
