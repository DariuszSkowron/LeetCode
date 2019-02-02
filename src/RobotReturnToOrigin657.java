public class RobotReturnToOrigin657 {

    public static void main(String[] args) {


        String input = "UDLRR";
        System.out.println(judgeCircle(input) ? "ROBOT POSITION IS 0,0!": "ROBOT IS NOT POSITIONED!");

    }


    public static   boolean judgeCircle(String moves) {
        int countHorizontal = 0;
        int countVertical = 0;
        for (int i = 0; i < moves.length(); i++){

        if (moves.charAt(i) == 'U')
            countHorizontal++;

        else if (moves.charAt(i) == 'D')
            countHorizontal--;

          else  if (moves.charAt(i) == 'L')
                countVertical++;

           else if (moves.charAt(i) == 'R')
                countVertical--;

    }
    return countHorizontal == 0 && countVertical == 0;
    }
}
