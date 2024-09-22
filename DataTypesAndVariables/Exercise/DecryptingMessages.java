package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int key=Integer.parseInt(s.nextLine());
        int rotations=Integer.parseInt(s.nextLine());

        for(int i=0;i<rotations;i++){
            char input=s.nextLine().charAt(0);
            System.out.printf("%c", (char)(input+key));
        }
    }
}
