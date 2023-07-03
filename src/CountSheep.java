public class CountSheep {
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