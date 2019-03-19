import java.util.Arrays;

public class SearchInsertPosition35 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums, target));
    }


    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        if (nums[nums.length -1] < target) return nums.length;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target) return i;
        }
        Arrays.sort(nums);
        for (int y = 0; y < nums.length; y++){
            if (nums[y] > target) return y;
        }
        return 0;
    }
}