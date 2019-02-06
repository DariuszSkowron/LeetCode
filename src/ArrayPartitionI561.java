import java.util.Arrays;

public class ArrayPartitionI561 {

    public static void main(String[] args) {

        int n = 2;
        int[] nums = {1, 4, 3, 2};

        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2){
         sum +=   Math.min(nums[i], nums[i+1]);
        }

        return sum;
    }
}


//Shorter solution, you dont need to checking the minumum value beacuse
// its already in order so lower position means lower digit
//    public static int arrayPairSum(int[] nums) {
//        Arrays.sort(nums);
//        int sum = 0;
//        for (int i = 0; i < nums.length; i += 2){
//            sum += nums[i];
//        }
//
//        return sum;
//    }
}
