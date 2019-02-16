public class ClimbingStairs70 {

    public static void main(String[] args) {
        int n = 9;

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 0 || n == 1 || n == 2) return n;

        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int allWays = 0;

        for (int i = 2; i < n; i++) {
            allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }

}
