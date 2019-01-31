import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity905 {

    public static void main(String[] args) {
        int[] A = {3,1,2,4, 5};
        System.out.println(sortArrayByParity(A));
    }

    public static int[] sortArrayByParity(int[] A) {
        List<Integer> sortedArray = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                sortedArray.add(A[i]);
            }
        }
        for (int y = 0; y < A.length; y++) {
            if (A[y] % 2 == 1) {
                sortedArray.add(A[y]);
            }
        }
        int[] response = sortedArray.stream().mapToInt(i->i).toArray();
        return response;


    }

}
