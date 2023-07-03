
public class ReturnArray {
    /**
     * Build a function that returns an array of integers from n to 1 where n>0.
     * Example : n=5 --> [5,4,3,2,1]
     */
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