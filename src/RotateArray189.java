import java.util.Arrays;

public class RotateArray189 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        System.out.println(Arrays.toString(rotate(nums,k)));
    }

    //it was void in the task so change it before commiting
    public static int[] rotate(int[] nums, int k) {
        int temp2;
        while (k > 0){
            int temp = nums[nums.length-1];
            for (int i = 0; i <  nums.length ; i++){
                temp2 = nums[i];
                nums[i] = temp;
                temp = temp2;
            }
            k--;
        }
        return nums;
    }
}


//    public void rotate(int[] nums, int k) {
//        k %= nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//    }
//
//    public void reverse(int[] nums, int start, int end) {
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }