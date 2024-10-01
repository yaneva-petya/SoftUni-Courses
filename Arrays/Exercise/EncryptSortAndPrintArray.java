package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());

        String[] names=new String[n];

        for(int i=0;i< names.length;i++){
            names[i]=s.nextLine();
        }
        int[] sum=new int[names.length];
        //System.out.print(String.join(",",names ));
        for(int k=0;k<names.length;k++){

            for(int j=0;j<names[k].length();j++){

                char symbol=names[k].charAt(j);

                if(symbol=='a' || symbol=='e' || symbol=='i' || symbol=='o' || symbol=='u' || symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U')//a, e, i, o, u, and sometimes y;
                {
                    sum[k]+=((int)symbol)*names[k].length();
                }
                else{
                    sum[k]+=((int)symbol)/names[k].length();
                }
            }
        }

        Arrays.sort(sum);
        for(int i:sum){
            System.out.println(i);
        }
    }
}
