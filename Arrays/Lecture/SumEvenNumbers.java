package Arrays.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] numbers=Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        System.out.println(sum);

    }
}
