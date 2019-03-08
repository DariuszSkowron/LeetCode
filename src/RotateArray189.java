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
