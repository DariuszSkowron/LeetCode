public class SumOfTwoIntegers371 {

    public static void main(String[] args) {
        int a = -11, b = 2;

        System.out.println(getSum(a, b));
    }


    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}

//
//    public static int getSum(int a, int b) {
//        return (b == 0) ? a : getSum(a ^ b, (a & b) << 1);
//    }

//    public static int getSum(int a, int b){
//        return Math.addExact(a,b);
//
//    }
//}
