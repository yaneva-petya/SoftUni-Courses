package Arrays.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] firstArray= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray=Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean areEqual=true;
        int index=0;

        for(int i =0;i<firstArray.length;i++){
                if(firstArray[i]!=secondArray[i]) {
                    index = i;
                    areEqual = false;
                    break;
                }
        }

        int sum=0;
        if(areEqual){
            for(int i=0;i<firstArray.length;i++){
                sum+=firstArray[i];
            }
            System.out.printf("Arrays are identical. Sum: %d%n", sum);

        }
        else{

            System.out.printf("Arrays are not identical. Found difference at %d index.\n", index);
        }
    }
}
