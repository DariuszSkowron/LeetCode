public class HouseRobber198 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums));
    }


    public static int rob(int[] nums) {
        int prevNo = 0, prevYes = 0;
        for (int n : nums) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }
}
