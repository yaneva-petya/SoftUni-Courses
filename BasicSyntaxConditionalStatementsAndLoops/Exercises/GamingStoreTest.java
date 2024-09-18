package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class GamingStoreTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double currentBalance=Double.parseDouble(s.nextLine());

        String input=s.nextLine();
        double spentMoney=0.0;
        while(!input.equals("Game Time")){
            switch (input){
                case "OutFall 4":
                    if(currentBalance>=39.99){
                        currentBalance-=39.99;
                        spentMoney+=39.99;
                        System.out.printf("Bought %s%n", input);
                    }
                    else{
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "CS: OG":
                    if(currentBalance>=15.99){
                        currentBalance-=15.99;
                        spentMoney+=15.99;
                        System.out.printf("Bought %s%n", input);}
                    else{
                        System.out.println("Too Expensive");
                        break;
                }
                    break;
                case "Zplinter Zell":
                    if(currentBalance>=19.99)
                    {
                        currentBalance-=19.99;
                        spentMoney+=19.99;
                        System.out.printf("Bought %s%n", input);}
                    else{
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "Honored 2":
                    if(currentBalance>=59.99){
                        currentBalance-=59.99;
                        spentMoney+=59.99;
                        System.out.printf("Bought %s%n", input);}
                    else{
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "RoverWatch":
                    if(currentBalance>=29.99){
                        currentBalance-=29.99;
                        spentMoney+=29.99;
                        System.out.printf("Bought %s%n", input);}
                    else{
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if(currentBalance>=39.99)
                    {
                        currentBalance-=39.99;
                        spentMoney+=39.99;
                        System.out.printf("Bought %s%n", input);}
                    else{
                        System.out.println("Too Expensive");
                        break;
                    }
                    break;
                default: System.out.println("Not Found");break;
            }

            if(currentBalance==0){
                System.out.println("Out of money!" );
                return;
            }
            else{
            input=s.nextLine();}
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", spentMoney,currentBalance);
    }
}
