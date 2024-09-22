package DataTypesAndVariables.Lecture;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number; i++) {
            int digits= i;
            int sumOfDigits=0;
            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits= digits/ 10;
            }

            if(sumOfDigits== 5 || sumOfDigits == 7 || sumOfDigits == 11){
                System.out.printf("%d -> True%n", i);
            }
            else{
                System.out.printf("%d -> False%n", i);
            }



        }

    }
}
