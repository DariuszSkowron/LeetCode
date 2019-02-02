public class RobotReturnToOrigin657 {

    public static void main(String[] args) {


        String input = "UDLRR";
        System.out.println(judgeCircle(input) ? "ROBOT POSITION IS 0,0!": "ROBOT IS NOT POSITIONED!");

    }


    public static   boolean judgeCircle(String moves) {
        int countHorizontal = 0;
        int countVertical = 0;
        for (int i = 0; i < moves.length(); i++){
        if (moves.charAt(i) == 'U'){
            countHorizontal++;
        }
        if (moves.charAt(i) == 'D'){
            countHorizontal--;
        }
            if (moves.charAt(i) == 'L'){
                countVertical++;
            }
            if (moves.charAt(i) == 'R'){
                countVertical--;
            }
    }
    if (countHorizontal == 0 && countVertical == 0){
            return true;
    }
    return false;
    }
}
