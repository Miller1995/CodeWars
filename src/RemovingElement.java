import java.util.ArrayList;
import java.util.List;

public class RemovingElement {
    /**
     * Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.
     * Example:
     * ["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]
     * None of the arrays will be empty, so you don't have to worry about that!
     */

    public static void main(String[] args) {
        Object[] objects = new Object[]{"Hello", "1", "3"};
        System.out.println(remove(objects));
    }

    public static Object[] remove(Object[] arr) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                list.add(arr[i]);
            }
        }
       return list.toArray();
    }
}
