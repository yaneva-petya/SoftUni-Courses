package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int c=Integer.parseInt(s.nextLine());


        if((a>=b) && (a>=c)){
            System.out.println(a);
            if(b>=c){
                System.out.printf("%d%n%d%n", b,c);
            }
           else{
                System.out.printf("%d%n%d%n", c,b);
            }
        }

        else if((b>=a) && (b>=c)){
            System.out.println(b);
            if(a>=c){
                System.out.printf("%d%n%d%n", a,c);
            }
            else{
                System.out.printf("%d%n%d%n", c,a);
            }
        }
        else{
            System.out.println(c);
            if(a>=b){
                System.out.printf("%d%n%d%n", a,b);
            }
            else{
                System.out.printf("%d%n%d%n", b,a);
            }
        }


    }
}
