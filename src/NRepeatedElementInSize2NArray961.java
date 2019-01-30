import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class NRepeatedElementInSize2NArray961 {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 3, 5, 5, 5, 5};
        System.out.println(repeatedNTimes(A));
    }


    public static int repeatedNTimes(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i + j < A.length && A[i] == A[i + j]) return A[i];
            }
        }
        return -1;
    }

}