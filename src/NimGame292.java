public class NimGame292 {

    public static void main(String[] args) {

        int n = 10;

        System.out.println(canWinNim(n));
    }

    public static boolean canWinNim(int n){
        return (n % 4 != 0);
    }
}
