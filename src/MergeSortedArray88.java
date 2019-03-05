import java.util.Arrays;

public class MergeSortedArray88 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3,3, 6, 8}, B = {2, 5, 6};
        int m = 3, n = 3;

        System.out.println(Arrays.toString(merge(A,m,B,n)));
    }

    public static int[] merge(int A[], int m, int B[], int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0) {
            A[k--] = A[i] > B[j] ? A[i--] : B[j--];
        }
        while(j >= 0) {
            A[k--] = B[j--];
        }
        return A;
    }
}


//    public static void merge(int[] A, int m, int[] B, int n) {
//        while (n != 0) {
//            for (int i = m; i < A.length; i++) {
//                A[i] = B[n - 1];
//                n--;
//            }
//        }
//        Arrays.sort(A);
//    }
//
//}
