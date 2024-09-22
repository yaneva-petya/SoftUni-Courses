package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n=Integer.parseInt(s.nextLine());
        double maxVolume=0;
        String winnerModel = " ";
        for(int i=0;i<n;i++){
            String model = s.nextLine();
            float radius=Float.parseFloat(s.nextLine());
            int height=Integer.parseInt(s.nextLine());

            double volume=Math.PI * radius*radius*height;
            //System.out.printf("Volume %d: %f%n", i, volume);
            if(volume>maxVolume){
                maxVolume=volume;
                winnerModel=model;

            }

        }
        System.out.printf("%s", winnerModel);
    }
}
