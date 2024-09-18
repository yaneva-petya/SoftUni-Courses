package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class ForeignLanguage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String country=s.nextLine();

        if(country.equals("USA") || country.equals("England")) System.out.println("English");
        else if(country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")) System.out.println("Spanish");
        else System.out.println("unknown");
    }
}
