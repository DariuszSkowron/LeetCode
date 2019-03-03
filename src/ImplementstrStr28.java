public class ImplementstrStr28 {

    public static void main(String[] args) {

        String haystack = "", needle = "a";

        System.out.println(strStr(haystack, needle));
//        System.out.println(haystack.substring(2, 2 + needle.length()));
    }


    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 && haystack.length() != 0) return 0;
        if (needle.length() != 0 && haystack.length() == 0) return -1;
        else if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;

    }
}

