package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double EPSILON = 0.000001;
        double a = Double.parseDouble(s.nextLine());
        double b=Double.parseDouble(s.nextLine());


        if (Math.abs(a - b) < EPSILON) {
            System.out.println("True");
        }
        else {
            System.out.println("False");}
    }
}
