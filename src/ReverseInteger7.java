import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class ReverseInteger7 {

    public static void main(String[] args) {
        int x = -120;

        System.out.println(reverse(x));

    }

    public static String reverse(int x) {
        String transformation = Integer.toString(x);
        StringBuilder result = new StringBuilder();
        for (int i = transformation.length() -1 ; i >= 0; i--) {
            if (transformation.substring(0,1).equals("-")) {
                result.append('-');
                i--;
            }
            result.append(transformation.charAt(i));
        }
        if (result.charAt(0) == '0') result.deleteCharAt(0);

        return result.toString();

    }
}
