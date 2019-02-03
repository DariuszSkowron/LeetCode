import java.util.Arrays;

public class SumOfEvenNumbersAfterQueries985 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(A, queries)));

    }

    public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int value = queries[i][0], index = queries[i][1];
            A[index] += value;
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    sum += A[j];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
