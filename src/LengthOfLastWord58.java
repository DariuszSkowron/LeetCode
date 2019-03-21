public class LengthOfLastWord58 {

    public static void main(String[] args) {
        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }



    public static int lengthOfLastWord(String s) {
        String cleanS = s.trim();
        if (cleanS.length() == 0) return 0;
        if (cleanS.contains(" ")) return cleanS.substring(cleanS.lastIndexOf(" ")).length() -1;
        return cleanS.length();
    }
}


//class Solution {
//    public int lengthOfLastWord(String s) {
//        int lastLen = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if (s.charAt(i) == ' ' && lastLen > 0) {
//                return lastLen;
//            } else if (s.charAt(i) != ' ') {
//                lastLen++;
//            }
//        }
//        return lastLen;
//    }
//}


