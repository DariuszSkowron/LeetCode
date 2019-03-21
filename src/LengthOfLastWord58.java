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



