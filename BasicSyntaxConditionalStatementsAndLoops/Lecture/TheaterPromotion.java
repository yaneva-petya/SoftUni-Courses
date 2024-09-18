package BasicSyntaxConditionalStatementsAndLoops.Lecture;

import java.util.Scanner;

public class TheaterPromotion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String day=s.nextLine();
        int age=Integer.parseInt(s.nextLine());

        int price=0;
        boolean isValid=true;

        switch (day){
            case "Weekday"->{
                if((age>=0 && age<=18) || (age>64 && age<=122)) price=12;
                else if(age>18 && age<=64) price=18;
                else isValid=false;}
            case "Weekend"->{
                if((age>=0 && age<=18) || (age>64 && age<=122)) price=15;
                else if(age>18 && age<=64) price=20;
                else isValid=false;}
            case "Holiday" -> {
                if(age>=0 && age<=18) price=5;
                else if(age<=64) price=12;
                else if(age<=122) price=10;
                else isValid=false;
            }
       }

       if(!isValid)
       {System.out.printf("%d$", price);}
        else{
            System.out.println("Error!");}
    }
}
