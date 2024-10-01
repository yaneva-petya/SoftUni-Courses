package Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numbers= Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String command=s.nextLine();

        while(!command.equals("end")){
           if(command.contains("swap")){
              int position1=Integer.parseInt(command.split(" ")[1]);
              int position2=Integer.parseInt(command.split(" ")[2]);

              int firstNum=numbers[position1];
              int secondNum=numbers[position2];

              numbers[position2]=firstNum;
              numbers[position1]=secondNum;

           }
           else if(command.contains("multiply"))
           {
               int post1=Integer.parseInt(command.split(" ")[1]);
               int post2=Integer.parseInt(command.split(" ")[2]);

               int first=numbers[post1];
               int second=numbers[post2];
               int result=first*second;
               numbers[post1]= result;

           }
           else if(command.equals("decrease")){
              for(int i=0;i<=numbers.length-1;i++){
                  numbers[i]--;
              }
           }

            command=s.nextLine();
        }

        for(int i=0;i<=numbers.length-1;i++){
            int num=numbers[i];
            if(i!=numbers.length-1){
                System.out.print(num+", ");
            }
            else{
                System.out.print(num);
            }
        }
    }
}
