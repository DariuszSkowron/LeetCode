import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome409 {

    public static void main(String[] args) {

        String s = "abccccdd";

        System.out.println(longestPalindrome(s));
    }


    public static int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}



//    public static int longestPalindrome(String s) {
//        if(s == null || s.length() == 0) return 0;
//
//        Set<Character> set = new HashSet<>();
//        for(char c : s.toCharArray()) {
//            if(set.contains(c)) set.remove(c);
//            else    set.add(c);
//        }
//        return set.size() == 0 ? s.length() : s.length() - set.size() + 1;
//    }
//}