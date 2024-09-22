package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class SpiceMustFLow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int startingYield=Integer.parseInt(s.nextLine());
        int days=0;
        int totalSpices=0;
        while(startingYield>=100){
            days++;
            int spicesPerDay=startingYield-26;
            totalSpices+=spicesPerDay;
            startingYield-=10;
        }
        totalSpices-=26;
        if(totalSpices<0){
            totalSpices=0;
        }
        System.out.printf("%d%n%d", days,totalSpices);
    }
}
