package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] firstArr= s.nextLine().split(" ");
        String[] secondArr=s.nextLine().split(" ");

       for(int i=0;i<secondArr.length;i++){
            for(int j=0;j< firstArr.length;j++){
                if(secondArr[i].equals(firstArr[j])){
                    System.out.print(secondArr[i]+" ");
                }
            }
        }


    }
}
