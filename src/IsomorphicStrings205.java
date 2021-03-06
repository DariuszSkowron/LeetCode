import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {

    public static void main(String[] args) {

        String s = "egg", t = "add";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
        char a = s.charAt(i), b = t.charAt(i);

        if (map.containsKey(a)) {
            if (map.get(a) != b)
                return false;
        } else if (!map.containsValue(b))
            map.put(a, b);
        else
            return false;
    }
    return true;
}
}