import java.util.Arrays;

public class MissingNumber268 {

    public static void main(String[] args) {

        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(missingNumber(nums));

    }


    public static int missingNumber(int[] nums) { //sum
        int len = nums.length;
        int sum = (0 + len) * (len + 1) / 2;
        for (int i = 0; i < len; i++)
            sum -= nums[i];
        return sum;
    }
}

//    public static int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        if (nums[nums.length-1] != nums.length) {
//            return nums.length;
//        }
//        else if (nums[0] != 0) {
//            return 0;
//        }
//        for (int i = 0; i < nums.length -1; i++){
//            if (nums[i] + 1 != nums[i +1]) return nums[i] +1;
//        }
//        return -1;
//    }
//}