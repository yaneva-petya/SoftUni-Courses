package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double currentBalance=Double.parseDouble(s.nextLine());

        String command=s.nextLine();
        double totalSpent=0.0;
        while (command.equals("Game Time")){
            double sum=0.0;
            switch (command) {
                case "OutFall 4" -> {

                    if (currentBalance >= 39.99) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= 39.99;
                        totalSpent+=39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                }
                case "CS: OG" -> {

                    if (currentBalance >= 15.99) {
                        System.out.printf("Bought %s%n", command);
                        currentBalance -= 15.99;
                        totalSpent+=15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                }
                case "Zplinter Zell" -> {

                    if (currentBalance >= 19.99) {
                        System.out.printf("Bought %s%n", command);
                        totalSpent += 19.99;
                        currentBalance -= 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                }
                case "Honored 2" -> {

                    if (currentBalance >= 59.99) {
                        System.out.printf("Bought %s%n", command);
                        totalSpent += 59.99;
                        currentBalance -= 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                }
                case "RoverWatch" -> {

                    if (currentBalance >= 29.99) {
                        System.out.printf("Bought %s%n", command);
                        totalSpent += 29.99;
                        currentBalance -= 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                }
                case "RoverWatch Origins Edition" -> {

                    if (currentBalance >= 39.99) {
                        System.out.printf("Bought %s%n", command);
                        totalSpent += 39.99;
                        currentBalance -= 39.99;

                    } else {System.out.println("Too Expensive");
                    }
                    break;
                }
                default -> {System.out.println("Not found"); break;}
            }
            totalSpent+=sum;
            if(currentBalance==0){
                System.out.println("Out of mo-ney!");
                return;
            }else{
                command=s.nextLine();}
        }

        if(currentBalance>0){
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent,currentBalance);}
        }
    }