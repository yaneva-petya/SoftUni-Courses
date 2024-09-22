package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int number=Integer.parseInt(s.nextLine());
        int sumOfDigits=0;
        while(number>0){
            sumOfDigits+=number%10;
            number=number/10;
        }

        //If the input is a String
        /*String input=s.nextLine();
        for(int i=0;i<input.length();i++){
            char symbol=input.charAt(i);
            int number=Character.getNumericValue(symbol);
            sumOfDigits+=number;
        }*/
        System.out.println(sumOfDigits);
    }
}
