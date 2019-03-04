public class HouseRobber198 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums));
    }


    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        nums[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++){
            nums[i] = Math.max(nums[i] + nums[i-2], nums[i-1]);
        }
        return nums[nums.length -1];
    }

}


//    public static int rob(int[] nums) {
//        int prevNo = 0, prevYes = 0;
//        for (int n : nums) {
//            int temp = prevNo;
//            prevNo = Math.max(prevNo, prevYes);
//            prevYes = n + temp;
//        }
//        return Math.max(prevNo, prevYes);
//    }
//}