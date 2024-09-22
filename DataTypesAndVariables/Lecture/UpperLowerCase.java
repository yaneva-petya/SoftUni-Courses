package DataTypesAndVariables.Lecture;

import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char input=s.nextLine().charAt(0);

        if(Character.isUpperCase(input)){
System.out.printf("upper-case");
        }
        else{
            System.out.printf("lower-case");
        }
    }
}
