public class NumberOf1Bits191 {

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;

        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        String transformation = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < transformation.length(); i++) {
            if (transformation.charAt(i) == '1') count++;
        }
        return count;

    }
}
