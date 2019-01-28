import java.util.Scanner;

public class JevelsAndStones771 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Jewels = scan.nextLine();
        String Stones = scan.nextLine();
        int result = numJewelsInStones(Jewels,Stones);
        System.out.println(result);

    }

    public static int numJewelsInStones(String Jewels,String Stones){
        int i, j, count = 0;
        for (i = 0; i < Stones.length(); i++) {
            for (j = 0; j < Jewels.length(); j++) {
                if (Stones.charAt(i) == Jewels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}