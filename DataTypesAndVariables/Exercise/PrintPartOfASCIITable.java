package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=Integer.parseInt(s.nextLine());
        int b=Integer.parseInt(s.nextLine());

        for(int i=a;i<=b;i++){

            System.out.print((char)i +" " );
        }
    }
}
