public class HammingDistance461 {

    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(hammingDistance(x,y));

    }

    public static int hammingDistance(int x, int y) {
        String xBinary = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String yBinary = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
        int diffCount = 0;
        for (int i = 0; i < xBinary.length(); i++) {
            if (xBinary.charAt(i) != yBinary.charAt(i)) diffCount++;
        }
        return diffCount;
    }
}
