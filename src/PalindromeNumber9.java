public class PalindromeNumber9 {

    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int num = 0;
        while (x > num) {
            num = num * 10 + x % 10;
            x /= 10;
        }
        return x == num || num / 10 == x;
    }
}
