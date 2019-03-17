public class RemoveElement27 {

    public static void main(String[] args) {

        int[] nums = {3, 3};
        int val = 3;

        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}


//    public static int removeElement(int[] nums, int val) {
//        int count = nums.length;
//        for (int i = 0; i < count; i++){
//            while (nums[i] == val && i < count){
//                nums[i] = nums[--count];
//            }
//        }
//        return count;
//    }
//}
