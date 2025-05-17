

public class NarcissisticNumber {

    public static void main(String[] args) {
        String s = "9";
        System.out.println(isNar(s));
    }

    public static boolean isNar(String str) {
        int number = Integer.parseInt(str);
        char[] c = str.toCharArray();
        double result = 0;

        for (int i = 0; i < c.length; i++) {
            int ch = Integer.parseInt(String.valueOf(c[i]));

            if (ch >= 0 && ch <= 9) {
                result += (Math.pow(ch, c.length));
            } else
                return false;
        }

        if (result == number)
            return true;
        else
            return false;
    }
}
