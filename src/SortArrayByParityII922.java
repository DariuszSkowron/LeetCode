import java.util.Arrays;

public class SortArrayByParityII922 {

    public static void main(String[] args) {
        int[] A = {4, 2, 5, 7};

        System.out.println(Arrays.toString(sortArrayByParityII(A)));
    }

    public static int[] sortArrayByParityII(int[] A) {
//        List<Integer> sortedArray = new ArrayList<>();
        int[] response = new int[A.length];
        int t = 0, k = 1;
        for (int i : A) {
            if (i % 2 == 0) {
                response[t] = i;
                t += 2;
            } else {
                response[k] = i;
                k += 2;
            }
        }
//        int[] response = sortedArray.stream().mapToInt(i->i).toArray();
        return response;
    }
}
