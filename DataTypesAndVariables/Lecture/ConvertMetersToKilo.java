package DataTypesAndVariables.Lecture;

import java.util.Scanner;

public class ConvertMetersToKilo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long meters=Integer.parseInt(s.nextLine());
        double kilometers=meters/1000.0;
        System.out.printf("%.2f",kilometers);

    }
}

