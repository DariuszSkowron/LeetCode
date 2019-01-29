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
        Set<String> transformations = new HashSet<String>();
        for (String word : words) {
            final StringBuilder transformation = new StringBuilder();
            for(char character : word.toCharArray()){
                transformation.append(MORSE_ENCODING[character - 'a']);
            }
         transformations.add(transformation.toString());
        }
        return transformations.size();
    }
}
