public class AddDigits258 {

    public static void main(String[] args) {

        int num = 55;

        System.out.println(addDigits(num));
    }

    public static int addDigits(int num){
        if(num<10)
            return num;
        else if(num%9 ==0)
            return 9;
        else
            return num%9;
    }
}
