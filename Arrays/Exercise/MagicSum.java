package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numbers= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magicNum=Integer.parseInt(s.nextLine());

        for(int i=0;i<numbers.length;i++){
            int currentNumber=numbers[i];
            for(int j=i+1;j<numbers.length;j++) {
                if (magicNum == currentNumber+ numbers[j]) {
                    System.out.printf("%d %d%n", currentNumber, numbers[j]);
                }
            }
        }
    }
}
