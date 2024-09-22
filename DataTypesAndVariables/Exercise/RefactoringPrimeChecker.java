package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isPrime);
        }

    }
}
