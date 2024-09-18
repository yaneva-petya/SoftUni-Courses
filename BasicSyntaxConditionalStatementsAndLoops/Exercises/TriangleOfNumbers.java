package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());

        for(int rows=1;rows<=n;rows++){
            for(int colums=1;colums<=rows;colums++){
                System.out.printf("%d ", rows);
            }
           System.out.println();

        }
    }
}

