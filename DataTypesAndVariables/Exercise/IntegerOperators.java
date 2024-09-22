package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class IntegerOperators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first=Integer.parseInt(s.nextLine());
        int second=Integer.parseInt(s.nextLine());
        int third=Integer.parseInt(s.nextLine());
        int fourth=Integer.parseInt(s.nextLine());

        System.out.println(((first+second)/third)*fourth);

    }
}
