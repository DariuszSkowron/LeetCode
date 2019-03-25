public class PowerOfTwo231 {

    public static void main(String[] args) {

        int n = 1;

        System.out.println(isPowerOfTwo(n));

    }



    public static boolean isPowerOfTwo(int n) {
        if (n < 1) return false;
        while ( n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}