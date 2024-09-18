package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count=Integer.parseInt(s.nextLine());
        int currentNumber=1;
        int sum=0;

        for(int i=1;i<=count;i++){
            sum+=currentNumber;
            System.out.printf("%d%n", currentNumber);
            currentNumber+=2;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
