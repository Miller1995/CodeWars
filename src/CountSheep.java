public class CountSheep {
    /**
     * Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
     * For example,
     * [true,  true,  true,  false,
     *   true,  true,  true,  true ,
     *   true,  false, true,  false,
     *   true,  false, false, true ,
     *   true,  true,  true,  true ,
     *   false, false, true,  true]
     * The correct answer would be 17.
     * Hint: Don't forget to check for bad values like null/undefined
     */

    public static void main(String[] args) {
        Boolean[] array = {true, false, true};
        countSheep(array);
    }

    public static int countSheep(Boolean[] arrays) {
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == null) {
                return 0;
            } else if (arrays[i]) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}