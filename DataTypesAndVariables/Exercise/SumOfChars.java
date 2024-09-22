package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=Integer.parseInt(s.nextLine());

        int sumOfChars=0;
        for(int i=1;i<=count;i++){
            char symbol=s.nextLine().charAt(0);
            sumOfChars+=(int)symbol;
        }
        System.out.printf("The sum equals: %d", sumOfChars);
    }
}
