package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input=s.nextLine();
        String current=" ";
        int currentNum, resultNum;
        int sum=0;

        for(int i=0;i<input.length();i++){
            int fact=1;
            current=input.charAt(i)+"";
            currentNum=Integer.parseInt(current);
           //System.out.println(currentNum);

           for(int j=1;j<=currentNum;j++){
               fact*=j;

           }
           //System.out.printf("Fact %d:%d%n", i, fact);
           sum+=fact;
        }
        //System.out.printf("Sum: %d", sum);

        resultNum=Integer.parseInt(input);
        if(resultNum==sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        //System.out.println(resultNum);
    }
}
