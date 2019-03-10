public class ReverseBits190 {

    public static void main(String[] args) {

        int n = 964176192;

        System.out.println(reverseBits(n));

    }
    public static int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>>= 1;
        }
        return res;
    }
}
