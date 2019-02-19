public class RomanToInteger13 {

    public static void main(String[] args) {
        String s = "LVIII", t = "MCMXCIV";

        System.out.println(romanToInt(s));
        System.out.println(romanToInt(t));
    }

    private static int getVal(char c){
        switch (c){
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X' :
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        throw new IllegalArgumentException("unsupported character");
    }

    public static int romanToInt(String s) {
        int res = 0;
        if(s.length() == 0) return res;
        for (int i = 0; i < s.length() - 1; i++) {
            int cur = getVal(s.charAt(i));
            int nex = getVal(s.charAt(i+1));
            if(cur < nex){
                res -= cur;
            }else{
                res += cur;
            }
        }
        return res + getVal(s.charAt(s.length()-1));
    }
}
