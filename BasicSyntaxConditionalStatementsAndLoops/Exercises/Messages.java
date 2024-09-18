package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = Integer.parseInt(s.nextLine());

       // String input=s.nextLine();

        for(int i=1;i<=count;i++){
            int inputNum=Integer.parseInt(s.nextLine());

            //Find the number of digits the number has "e.g. 222 -> 3 digits"
            String inputAsText=Integer.toString(inputNum);
            int countDigitsInput=inputAsText.length();

            //Find the main digit of the number "e.g.  222 -> 2"
            int mainDigit=inputNum%10;

            //Find the offset of the number. To do that, you can use the formula: (main digit - 2) * 3
            int offset=(mainDigit-2)*3;

            //If the main digit is 8 or 9, we need to add 1 to the offset since the digits 7 and 9 have 4 letters each
            if(mainDigit==8 || mainDigit==9){
                offset++;
            }

            //Finally, find the letter index (a -> 0, c -> 2, etc.). To do that, we can use the following formula: (offset + digit length - 1).
            int letterIndex=offset+countDigitsInput-1;

            //After we've found the letter index, we can just add that to the ASCII code of the lowercase letter "a" (97)
            if(inputNum==0){
                System.out.print(" ");
            }
            else{
                System.out.print((char)(letterIndex+97));
            }

        }
    }
}
