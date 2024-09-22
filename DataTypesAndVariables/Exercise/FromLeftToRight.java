package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());


        for(int i=0;i<n;i++){
            String input=s.nextLine();
            String left="";
            String right="";
            boolean isRight=false;

            for(int j=0;j<input.length();j++){
                char symbol = input.charAt(j);



                if(symbol == ' '){
                    isRight=true;
                    continue;
                }

                if(isRight){
                    right+=symbol;
                }
                else{
                    left+=symbol;
                }
            }

            long first=Long.parseLong(left);
            long second=Long.parseLong(right);

            long biggerNum=Math.max(first, second);
             long absBiggerNum=Math.abs(biggerNum);
            int sum=0;

            while(absBiggerNum>0){
                sum+=absBiggerNum%10;
                absBiggerNum/=10;
            }
            System.out.println(sum);
        }


    }
}
