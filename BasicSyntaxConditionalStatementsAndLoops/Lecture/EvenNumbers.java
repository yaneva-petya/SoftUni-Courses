package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            int num=Integer.parseInt(s.nextLine());
            int abs=Math.abs(num);
            if(abs%2==0) {
                System.out.printf("%d%n", abs);
                break;}
            else
            {System.out.printf("Please write an even number.%n");}
        }


    }
}
