public class RansomNote383 {

    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
    }


    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
