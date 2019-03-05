import java.util.Arrays;

public class MergeSortedArray88 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6};
        int m = 3, n = 3;

        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n != 0) {
            for (int i = m; i < nums1.length; i++) {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }
        Arrays.sort(nums1);
    }

}
