package DataTypesAndVariables.Lecture;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double britishPounds=Double.parseDouble(s.nextLine());
        double dollars=britishPounds*1.36;
        System.out.printf("%.3f", dollars);
    }
}
