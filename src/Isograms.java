public class Isograms {

    /**
     * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
     * Implement a function that determines whether a string that contains only letters is an isogram.
     * Assume the empty string is an isogram. Ignore letter case.
     * <p>
     * Example: (Input --> Output)
     * --> true "aba"
     * --> false "moOse"
     * --> false (ignore letter case)
     */

    public static void main(String[] args) {
        String str = "";
        System.out.println(isIsogram(str));
    }

    public static boolean isIsogram(String str) {
        char[] result = str.toLowerCase().toCharArray();

        for (int i = 0; i < result.length; i++) {
            for (int j = i; j < result.length - 1; j++) {
                if (result[i] == result[j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
