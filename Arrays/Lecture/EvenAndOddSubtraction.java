package Arrays.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] num= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumOfOdd=0, sumOfEven=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                sumOfEven+=num[i];
            }
            else{
                sumOfOdd+=num[i];
            }
        }
        System.out.println(sumOfEven-sumOfOdd);
    }
}
