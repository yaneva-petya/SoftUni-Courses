package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number=Integer.parseInt(s.nextLine());

        for(int i=1;i<=10;i++){
                System.out.printf("%d X %d = %d%n", number,i,number*i);
        }

    }
}

