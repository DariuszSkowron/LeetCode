import java.util.Stack;

public class ValidParentheses20 {

    public static void main(String[] args) {

        String s = "([]{})";

        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

//       public static boolean isValid(String s) {
//        char[] stack = new char[s.length()];
//        int head = 0;
//
//        for (char c : s.toCharArray()) {
//            switch (c) {
//                case '(':
//                    stack[head++] = ')';
//                    break;
//                case '{':
//                    stack[head++] = '}';
//                    break;
//                case '[':
//                    stack[head++] = ']';
//                    break;
//                default:
//                    if (head == 0 || stack[--head] != c) return false;
//                    break;
//            }
//        }
//        return head == 0;
//    }
//}
