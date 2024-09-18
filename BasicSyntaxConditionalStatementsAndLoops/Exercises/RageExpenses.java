package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int lostGames=Integer.parseInt(s.nextLine());
        double headsetPrice=Double.parseDouble(s.nextLine());
        double mousePrice=Double.parseDouble(s.nextLine());
        double keyboardPrice=Double.parseDouble(s.nextLine());
        double displayPrice=Double.parseDouble(s.nextLine());

        int lostHeadset=lostGames/2;
        int lostMouse=lostGames/3;
        int lostKeyboard=lostGames/6;
        int lostDisplay=lostKeyboard/2;

        double expenses=lostHeadset*headsetPrice+lostMouse*mousePrice+lostKeyboard*keyboardPrice+lostDisplay*displayPrice;
        System.out.printf("Rage expenses: %.2f lv.%n", expenses);
    }
}
