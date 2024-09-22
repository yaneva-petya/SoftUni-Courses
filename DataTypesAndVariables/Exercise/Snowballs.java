package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfSnowballs=Integer.parseInt(s.nextLine());

        int maxSnowballSnow=0;
        int maxSnowballTime=0;
        int maxSnowballQuality=0;
        double maxSnowballValue=0;


        for(int i=0;i<numberOfSnowballs;i++){
            int snowballSnow=Integer.parseInt(s.nextLine());
            int snowballTime=Integer.parseInt(s.nextLine());
            int snowballQuality=Integer.parseInt(s.nextLine());
            double snowballValue=Math.pow(snowballSnow/snowballTime,snowballQuality);
           // System.out.println(snowballValue);
            if(snowballValue>maxSnowballValue){
                maxSnowballValue=snowballValue;
                maxSnowballSnow=snowballSnow;
                maxSnowballTime=snowballTime;
                maxSnowballQuality=snowballQuality;
                maxSnowballValue=snowballValue;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue,maxSnowballQuality );


    }
}
