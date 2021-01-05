package WordsCounter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Counter2 {

    public static void main(String[] args) throws Exception {

        String word = "Urszula", website = "https://pl.wikipedia.org/wiki/Jan_Kochanowski";

        System.out.println(wordsCounter(word, website));
    }

    public static int wordsCounter(String word, String website) throws Exception {
        if (word == null) {
            throw new NullPointerException("Word cant be null");
        }
        if (word.equals("")) {
            throw new IllegalArgumentException("Please insert word longer than 1 ");
        }
        URL url = new URL(website);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        int counter = 0;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < line.length() - word.length(); i++) {
                if (line.substring(i, i + word.length()).contains(word)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
