public class RepeatedSubstringPattern459 {

    public static void main(String[] args) {

        String s ="abcabcabcabc";

        System.out.println(repeatedSubstringPattern(s));
    }

    public static boolean repeatedSubstringPattern(String s) {
        int l = s.length();

        for (int i = l/2; i >= 1; i--){
            if (l%i == 0){
                int m = l/i;
                String subS = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++){
                    sb.append(subS);
                }
                if (sb.toString().equals(s))return true;
            }
        }
        return false;
    }
}
