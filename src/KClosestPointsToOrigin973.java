import java.util.Arrays;
import java.util.Comparator;

public class KClosestPointsToOrigin973 {

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int K = 1;
        System.out.println(kClosest(points, K));
    }

    public static int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}
