import java.util.Scanner;

public class ToLowerCase709 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String result = toLowerCase(str);
        System.out.println(result);

    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}


