import java.util.Arrays;

public class PlusOne66 {


    public static void main(String[] args) {
        int[] digits = {9};

        System.out.println(Arrays.toString(plusOne(digits)));
    }


    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}

//    public static int[] plusOne(int[] digits) {
//        digits[digits.length -1] += 1;
//        if (digits[digits.length -1] == 9){
//            int[] newArray = new int [n + 1];
//            newNumber[0] = 1;
//        }
//
//
//        return digits;
//    }
//}

