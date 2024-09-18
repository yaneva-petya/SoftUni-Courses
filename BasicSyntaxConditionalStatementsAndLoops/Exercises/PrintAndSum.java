package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());
        int sum=0;
        for(int i=a;i<=b;i++){
            System.out.printf("%d\t",i);
            sum+=i;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
