public class FactorialTrailingZeroes172 {

    public static void main(String[] args) {
        int n = 30;


        System.out.println(trailingZeroes(n));
    }

    public static int trailingZeroes(int n) {
        int s = 0;
        while (n > 4) s += (n /= 5);
        return s;
    }
}


//
//public int trailingZeroes(int n)
//        {
//        if(n < 5)
//        return 0;
//        else
//        return (n / 5) + trailingZeroes(n / 5);
//        }
//        }