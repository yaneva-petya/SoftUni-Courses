package DataTypesAndVariables.Lecture;

import java.util.Scanner;

public class ConcatName {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String firstName=s.nextLine();
    String secondName=s.nextLine();
    String delimiter=s.nextLine();
    System.out.printf("%s%s%s",firstName, delimiter,secondName);

    }
}
