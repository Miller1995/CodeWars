public class CheckForFactor {
    public static void main(String[] args) {
        int base = 10;
        int factor = 2;
        System.out.println(check(base, factor));
    }

    public static boolean check(int base, int factor) {
        return base % factor == 0 ? true : false;
    }
}
