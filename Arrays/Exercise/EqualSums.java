package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean isFound=false;
        int index=0;
        for(int i=0;i< arr.length;i++){


            int sumOfLeft=0, sumOfRight=0;
            for(int j=0;j<i;j++){
                sumOfLeft+=arr[j];
            }

            for(int k=i+1;k< arr.length;k++){
                sumOfRight+=arr[k];
            }

            if(sumOfLeft==sumOfRight){
                isFound=true;
                index=i;
                break;
            }

        }

        if(isFound){System.out.printf("%d", index);}
        else{System.out.println("no");}
    }
}
