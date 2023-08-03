import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfPeopleInBus {
    /**
     * There is a bus moving in the city which takes and drops some people at each bus stop.
     * You are provided with a list (or array) of integer pairs. Elements of each pair represent the number of people
     * that get on the bus (the first item) and the number of people that get off the bus (the second item) at a bus stop.
     * Your task is to return the number of people who are still on the bus after the last bus stop (after the last array).
     * Even though it is the last bus stop, the bus might not be empty and some people might still be inside the bus,
     * they are probably sleeping there :D
     * Take a look on the test cases.
     * Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0.
     * So the returned integer can't be negative.
     * The second value in the first pair in the array is 0, since the bus is empty in the first bus stop.
     */

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 2});
        list.add(new int[]{3, 2});

        System.out.println(countPeople(list));
    }

    public static int countPeople(ArrayList<int[]> stops) {
        int result = 0;
        for (int i = 0; i < stops.size(); i++) {
            result = result + stops.get(i)[0];
            result = result - stops.get(i)[1];
        }
        return result;
    }

    public static int countPeopleV2(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }

    public static int countPeopleV3(ArrayList<int[]> stops) {
        int result = 0;
        for (int[] i : stops) {
            result += i[0] - i[1];
        }
        return result;
    }
}
