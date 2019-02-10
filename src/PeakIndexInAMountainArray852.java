public class PeakIndexInAMountainArray852 {

    public static void main(String[] args) {
        int[] A = {0,1,0};

        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A) {
            for (int i = 1; i < A.length -1; i++)
                if (A[i] > A[i - 1] && A[i] > A[i + 1]) return i;
            return -1;
    }
}
