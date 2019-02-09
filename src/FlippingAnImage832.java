import java.util.Arrays;

public class FlippingAnImage832 {

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(A[0].length);
        System.out.println(A.length);

        System.out.println(Arrays.deepToString(flipAndInvertImage(A)));
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int leftNumber = 0, rightNumber = A[0].length -1;
            while (leftNumber <= rightNumber){
                if(A[i][leftNumber] == A[i][rightNumber]){
                    A[i][leftNumber] = 1 - A[i][leftNumber];
                    A[i][rightNumber] = A[i][leftNumber];
                }
                leftNumber++;
                rightNumber--;
            }
        }
        return A;
    }
}


//Another possible solution
//public int[][] flipAndInvertImage(int[][] A) {
//    int n = A.length;
//    for (int[] row : A)
//        for (int i = 0; i * 2 < n; i++)
//            if (row[i] == row[n - i - 1])
//                row[i] = row[n - i - 1] ^= 1;
//    return A;
//}
