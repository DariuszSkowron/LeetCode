public class ValidPalindrome125 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.toLowerCase();
        int n = s.length(), i = 0, j = n -1;

        char[] chars = s.toCharArray();

        while (i < j){
            while(i < n && !Character.isLetterOrDigit(chars[i])) i++;
            while (j >= 0 && !Character.isLetterOrDigit(chars[j])) j--;

            if (i < j && chars[i++] != chars[j--]) return false;
            }
            return true;
        }

    }

//    public boolean isPalindrome(String s) {
//        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
//        String rev = new StringBuffer(actual).reverse().toString();
//        return actual.equals(rev);
//    }
//}
