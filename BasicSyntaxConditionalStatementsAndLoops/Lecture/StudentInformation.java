package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String studentName=s.nextLine();
        int age=Integer.parseInt(s.nextLine());
        double grade=Double.parseDouble(s.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.2f", studentName,age,grade);
        System.out.println(result);

    }
}

