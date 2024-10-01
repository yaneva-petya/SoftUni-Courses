package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arr= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

       for(int i=0;i<arr.length;i++){
           int currentNumber=arr[i];
           boolean isBigger=true;
           for(int j=i+1;j<arr.length;j++){
               if(currentNumber<=arr[j]){
                     isBigger=false;
                     break;
               }

           }
           if(isBigger) System.out.print(currentNumber+" ");
       }
    }
}
