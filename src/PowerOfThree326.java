public class PowerOfThree326 {

    public static void main(String[] args) {

        int n = 28;

        System.out.println(isPowerOfThree(n));

    }


    public static boolean isPowerOfThree(int n) {
        if (n < 1) return false;
        while ( n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }
}


//    public boolean isPowerOfThree(int n) {
//        // 1162261467 is 3^19,  3^20 is bigger than int
//        return ( n>0 &&  1162261467%n==0);
//    }