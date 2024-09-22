package DataTypesAndVariables.Lecture;

import java.util.Scanner;

public class ReversedChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char one=s.nextLine().charAt(0);
        char two=s.nextLine().charAt(0);
        char three=s.nextLine().charAt(0);

        System.out.printf("%c %c %c", three,two,one);

    }
}
