public class SmallerInteger {
    /**
     * Given an array of integers your solution should find the smallest integer.
     * For example:
     * Given [34, 15, 88, 2] your solution will return 2
     * Given [34, -345, -1, 100] your solution will return -345
     * You can assume, for the purpose of this kata, that the supplied array will not be empty.
     */

    public static void main(String[] args) {
        int array[] = {-44, 1, -33, 4, -7, 9, -19};
        findSmaller(array);
    }

    public static int findSmaller(int[] args) {
        int temp = args[0];
        for (int i = 0; i < args.length; i++) {
            if (args[i] <= temp)
                temp = args[i];
        }
        System.out.println(temp);
        return temp;
    }
}
