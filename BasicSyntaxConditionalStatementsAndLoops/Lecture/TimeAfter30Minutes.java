package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours = Integer.parseInt(s.nextLine());
        String minInput = s.nextLine();
        int min = Integer.parseInt(minInput);

        System.out.printf("After parsing the minutes:%d%n",min);
        int extraMin=min+30;

        System.out.printf("After 30 min:%d%n", extraMin);

        if(extraMin>59) {
            extraMin-=60;
            hours++;
            if(hours>23){
                hours-=24;
            }
        }

        System.out.printf("Hours:%d%nMinutes:%d%n", hours, extraMin);
        if(extraMin>=10) System.out.printf("%d:%d%n", hours, extraMin);
        else System.out.printf("%d:0%d%n", hours,extraMin);


    }
}
