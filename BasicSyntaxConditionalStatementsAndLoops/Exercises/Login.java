package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            String username=s.nextLine();
            String password="";

            for(int position=username.length()-1;position>=0;position--){
                char currentSymbol=username.charAt(position);
                password+=currentSymbol;
            }

            //System.out.println(password);

            String enteredPassword=s.nextLine();
            int attempt=0;
            while (!enteredPassword.equals(password)){
                attempt++;
                if(attempt==4){
                    System.out.printf("User %s blocked!", username);
                    return;
                }
                System.out.println("Incorrect password. Try again.");
                enteredPassword=s.nextLine();
            }

            System.out.printf("User %s logged in.", username);
        }
    }
