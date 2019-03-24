public class ExcelSheetColumnTitle168 {

    public static void main(String[] args) {
        int n = 28;

        System.out.println(convertToTitle(n));
        System.out.println((char)('A' + 5));
        System.out.println('B' - 'A' + 1);
    }


    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n>0){
            n--;
            result.insert(0,(char)('A' + n % 26));
            n /= 26;
        }
        return result.toString();
    }
}
