package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations=Integer.parseInt(s.nextLine());

        for(int i=0;i<rotations;i++){
            int currentNum=array[0];
            for(int j=0;j<array.length-1;j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = currentNum;
        }

        for(int nums:array){
            System.out.print(nums+ " ");
        }
    }
}
