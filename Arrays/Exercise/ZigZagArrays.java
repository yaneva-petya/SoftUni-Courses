package Arrays.Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int countRows=Integer.parseInt(s.nextLine());
        int[] firstArr=new int[countRows];
        int[] secondArr=new int[countRows];

        for(int row=1;row<=countRows;row++){
          String input=s.nextLine();
          int firstNum=Integer.parseInt(input.split(" ")[0]);
          int secondNum=Integer.parseInt(input.split(" ")[1]);
          //when the row is odd number - first number is in the firstArr, second number - secondArr;
            //when the row is even number - first number is in the secondArr, second number - firstArr;
           if(row%2==0){
               secondArr[row-1]=firstNum;
               firstArr[row-1]=secondNum;

           }
           else{
               firstArr[row-1]=firstNum;
               secondArr[row-1]=secondNum;
           }
        }

        for(int first: firstArr){
            System.out.print(first+" ");
        }
        System.out.println();
        for(int second: secondArr){
            System.out.print(second + " ");
        }

    }
}
