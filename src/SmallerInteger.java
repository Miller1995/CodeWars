public class SmallerInteger {
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
