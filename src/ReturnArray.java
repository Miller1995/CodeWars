import java.util.Arrays;

public class ReturnArray {
    public static void main(String[] args) {
        int n = 5;
        revers(n);
    }

    public static int[] revers(int n) {
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }
}