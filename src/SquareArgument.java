public class SquareArgument {

    /**
     *Now you have to write a function that takes an argument and returns the square of it.
     */

    public static void main(String[] args) {
        int n  = 2;
        System.out.println(square(n));
    }

    public static int square(int n){
        int result = n * n;
        return result;
    }
}
