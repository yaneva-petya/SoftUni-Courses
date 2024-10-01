package Arrays.Lecture;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());

        int[] numbers=new int[n];

        for(int i=0;i<numbers.length;i++){
            numbers[i]=Integer.parseInt(s.nextLine());
        }

        for(int i=numbers.length-1;i>=0;i--){
            System.out.printf("%d\t",numbers[i]);
        }
    }
}
