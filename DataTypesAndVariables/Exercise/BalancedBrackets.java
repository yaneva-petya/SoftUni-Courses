package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isBalanced=true;
        int balance=0;
        int n=Integer.parseInt(s.nextLine());
        for(int i=0;i<n;i++) {
            String input = s.nextLine();

             for(int j=0;j<input.length();j++){

                char symbol = input.charAt(j);
                if (symbol == '(') {
                    balance++;

                } else if (symbol == ')') {

                    balance--;
                }
            }
             if(balance<0){
                 isBalanced=false;
                 break;
             }

        }

       if(isBalanced && balance==0) {System.out.println("BALANCED");}
        else {System.out.println("UNBALANCED");}
    }
}
