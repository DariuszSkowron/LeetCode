public class FibbonaciNumber509 {

    public static void main(String[] args) {

        int N = 7;

        System.out.println(fib(N));
    }

    public static int fib(int N) {
        if(N <= 1) return N;
        return fib(N-1)+fib(N-2);
    }
}
