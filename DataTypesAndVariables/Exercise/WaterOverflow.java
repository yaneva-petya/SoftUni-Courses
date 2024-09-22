package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numberOfLines=Integer.parseInt(s.nextLine());

        int i=1;
        int sum=0;

       while(i<=numberOfLines){
           int liters=Integer.parseInt(s.nextLine());
           if(sum+liters>255){
               System.out.println("Insufficient capacity!");

           }else {
               sum += liters;
           }
           i++;

       }
        System.out.printf("%d",sum);
    }
}
