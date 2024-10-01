package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int peopleWaiting=Integer.parseInt(s.nextLine());
        int[] wagons= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxCapacityWagons=4;
        for(int i=0;i<wagons.length;i++){
            if(peopleWaiting==0) break;

            int availableSpace=maxCapacityWagons-wagons[i];

            if(availableSpace>0){
                if(peopleWaiting>=availableSpace){
                    wagons[i]+=availableSpace;
                    peopleWaiting-=availableSpace;
                }
                else{
                    wagons[i]+=peopleWaiting;
                    peopleWaiting=0;
                }
            }

        }

        boolean hasEmptySpots=false;
        for(int wagon:wagons){
            if(wagon<maxCapacityWagons){
                hasEmptySpots=true;
                break;
            }
        }

        if(peopleWaiting==0 && hasEmptySpots){
            System.out.printf("The lift has empty spots!%n");
        }
        else if(peopleWaiting>0 && !hasEmptySpots){
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting);
        }

        for(int wagon:wagons){
            System.out.print(wagon+" ");
        }
    }

}
