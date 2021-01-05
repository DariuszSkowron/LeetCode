package WordsCounter;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Counter {


    public static void main(String[] args) {

        String word = "Urszula", website = "https://pl.wikipedia.org/wiki/Jan_Kochanowski";

        String content = null;
        URLConnection connection = null;

        try {
            connection = new URL("https://pl.wikipedia.org/wiki/Jan_Kochanowski").openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(content);
        System.out.println(wordsCounter(word, website));
    }

    public static int wordsCounter(String word, String website){
        String content = null;
        URLConnection connection = null;

        try {
            connection = new URL(website).openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (word == null){
            throw new NullPointerException("Word cant be null");
        }
        if (word.equals("")){
            throw new IllegalArgumentException("Please insert word longer than 1 ");
        }
        int counter = 0;
        for (int i = 0; i < content.length() - word.length(); i++) {
            if (content.substring(i, i + word.length()).contains(word)) {
                counter++;
            }
        }
        return counter;
    }
}
