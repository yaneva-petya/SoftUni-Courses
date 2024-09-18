package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input=s.nextLine();
        String result="";

        for(int position=input.length()-1;position>=0;position--){
            char symbol=input.charAt(position);
            result+=symbol;
        }
        System.out.println(result);
    }
}
