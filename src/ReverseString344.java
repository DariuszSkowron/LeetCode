public class ReverseString344 {

    public static void main(String[] args) {
        char[] s = {'s', 'p', 'r', 'a', 'w', 'd', 'z', 'a', 'm'};

        System.out.println(reverseString(s));

    }

    public static char[] reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
        return s;
    }
}
