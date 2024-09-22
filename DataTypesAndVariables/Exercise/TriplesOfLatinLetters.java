package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int rotations=Integer.parseInt(s.nextLine());

       for(char letter1='a'; letter1<'a'+rotations;letter1++){
           for(char letter2='a';letter2<'a'+rotations;letter2++){
               for (char letter3='a';letter3<'a'+rotations;letter3++){
                   System.out.printf("%c%c%c%n", letter1,letter2,letter3);
               }
           }
       }
    }
}
