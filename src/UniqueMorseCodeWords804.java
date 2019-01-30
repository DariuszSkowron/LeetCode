import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class UniqueMorseCodeWords804 {

    private static final String[] MORSE_ENCODING = new String[] {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
            "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static void main(String[] args) {


        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(uniqueMorseRepresentations(words));

    }

    public static int uniqueMorseRepresentations(String[] words) {
        final Set<String> s = new HashSet<String>();
        for(String w : words) {
            StringBuilder sb= new StringBuilder();
            for(char c : w.toCharArray()){
                sb.append(MORSE_ENCODING[c-'a']);
            }
            s.add(sb.toString());
        }
        return s.size();
    }
}
