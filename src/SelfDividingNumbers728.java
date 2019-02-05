import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {

    public static void main(String[] args) {
        int left = 1, right = 22;
        System.out.println(selfDividingNumbers(left,right));
    }





    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++)
            if (dividingNumber(i)) res.add(i);
        return res;
    }

    static boolean dividingNumber(int num) {
        for (int n = num; n > 0; n /= 10)
            if (n % 10 == 0 || num % (n % 10) != 0) return false;
        return true;
    }
}





