import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementInSize2NArray961 {

    public static void main(String[] args) {
        int[] A = {5, 1, 5, 2, 5, 3, 5, 4, 1, 1, 1, 1, 1, 23, 1, 1, 1};
        System.out.println(repeatedNTimes(A));
    }


    public static int repeatedNTimes(int[] A) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<A.length;i++) {
            if(set.contains(A[i])) return A[i];
            set.add(A[i]);
        }
        return -1;
    }
}
