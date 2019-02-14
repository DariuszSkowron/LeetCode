import java.util.Arrays;

public class MajorityElement169 {

    public static void main(String[] args) {
        int[] nums = {3, 3, 4};

        System.out.println(majorityElement(nums));
    }


    public static int majorityElement(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret;
    }
}





//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];
//
//    }