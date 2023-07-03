public class ExclamationMark {
    public static void main(String[] args) {
        String s = "Hello World!";
        System.out.println(remove(s));

    }

    public static String remove(String s) {
        if (s.contains("!"))
            return s.replaceAll("!", "");
        else
            return s;
    }
}
