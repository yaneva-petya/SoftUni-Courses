package Arrays.Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        int[] arr=new int[n];
        int sum=0;
        for(int i=0; i<n;i++){
            arr[i]=Integer.parseInt(s.nextLine());
            sum+=arr[i];
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.printf("%n%d",sum);
    }

}
