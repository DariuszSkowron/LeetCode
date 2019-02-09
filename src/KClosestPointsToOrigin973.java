import java.util.Arrays;
import java.util.Comparator;

public class KClosestPointsToOrigin973 {

    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int[][] points1 = {{1, 3}, {-2, 2}};

        int K = 1;
        System.out.println(Arrays.deepToString(kClosest(points, K)));
        System.out.println((points1[1][0]));
    }

    public static int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparing(p -> p[0] * p[0] + p[1] * p[1]));
        return Arrays.copyOfRange(points, 0, K);
    }
}




//    public int[][] kClosest(int[][] points, int K) {
//        Arrays.sort(points, new PointCompare());
//        int[][] res = new int[K][2];
//        for(int i = 0; i < K; i++) res[i] = points[i];
//        return res;
//    }
//}
//class PointCompare implements Comparator<int[]>{
//    public int compare(int[] a, int[]b){
//        int distA = a[0]*a[0] + a[1]*a[1];
//        int distB = b[0]*b[0] + b[1]*b[1];
//
//        return distA < distB ? -1 : 1;
//    }
//}
