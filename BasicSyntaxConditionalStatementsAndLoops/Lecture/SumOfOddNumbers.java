package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        int sum=0;
        for(int i=1;i<100;i++){
            if(i%2!=0) System.out.println(i);
            sum+=i;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
