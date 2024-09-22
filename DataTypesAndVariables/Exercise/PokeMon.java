package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int power=Integer.parseInt(s.nextLine());
        int distance=Integer.parseInt(s.nextLine());
        int factor=Integer.parseInt(s.nextLine());
        int startPower=power;

        int count=0;
        while(power>=distance){
            power-=distance;
            count++;
            if(power==startPower/2 && factor!=0){
                power=power/factor;
            }

        }
        System.out.printf("%d%n%d", power,count);


    }
}
