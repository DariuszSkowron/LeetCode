public class FindTheDifference389 {

    public static void main(String[] args) {
        String s = "abcd", t ="abcde";

        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        if (s.length() == 0) return t.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return s.charAt(i);
            }
        }
        return t.charAt(t.length() -1);
    }

}

//FINISH THIS