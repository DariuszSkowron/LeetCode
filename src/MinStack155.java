import java.util.Stack;


public class MinStack155 {
    public static void main(String[] args) {
        MinStack155 minstack = new MinStack155();
        minstack.push(1);
        minstack.push(2);

        System.out.println(minstack.getMin());

    }


        long min;
        Stack<Long> stack;

        public MinStack155() {
            stack = new Stack<>();
        }

        public void push(int x) {
            if (stack.isEmpty()) {
                stack.push(0L);
                min = x;
            } else {
                stack.push(x - min);
                if (x < min) min = x;
            }
        }

        public void pop() {
            if (stack.isEmpty()) return;

            long pop = stack.pop();

            if (pop < 0) min = min - pop;

        }

        public int top() {
            long top = stack.peek();
            if (top > 0) {
                return (int) (top + min);
            } else {
                return (int) (min);
            }
        }

        public int getMin() {
            return (int) min;
        }

    }