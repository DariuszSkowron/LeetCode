public class ValidPerfectSquare367 {

    public static void main(String[] args) {
        int num = 64;

        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        if (num == Integer.MAX_VALUE) return false;
        for (int i = 1; i <= num; i++) {
            if (num / i == i && num % i == 0) {
                return true;
            }
        }
        return false;
    }
}


//Newton method
//    public boolean isPerfectSquare(int num) {
//        long x = num;
//        while (x * x > num) {
//            x = (x + num / x) >> 1;
//        }
//        return x * x == num;
//    }