public class FirstUniqueCharacterInAString387 {

    public static void main(String[] args) {
        String s = "aadadaad";

        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int[] charCount = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) charCount[c - 'a']++;
        for (int i = 0; i < chars.length; i++)
            if (charCount[chars[i] - 'a'] == 1) return i;
        return -1;
    }
}