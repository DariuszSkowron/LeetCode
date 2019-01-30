import java.util.Arrays;

public class SquaresOfASortedArray977 {

    public static void main(String[] args) {
        int[] unsortedArray = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(unsortedArray)));
    }

    public static int[] sortedSquares(int[] unsortedArray) {

        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = unsortedArray[i] * unsortedArray[i];
        }
        Arrays.sort(unsortedArray);
        return unsortedArray;
    }

}
