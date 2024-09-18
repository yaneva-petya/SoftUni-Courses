package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(s.nextLine());
        int countOfStudents = Integer.parseInt(s.nextLine());
        double priceOfLightsabers = Double.parseDouble(s.nextLine());
        double priceOfRobers = Double.parseDouble(s.nextLine());
        double priceOfBelts = Double.parseDouble(s.nextLine());

        int freeBelts = countOfStudents / 6;
       // System.out.println(freeBelts);
        double neededMoney =Math.ceil(countOfStudents + 0.10 * countOfStudents) * priceOfLightsabers+
        + priceOfRobers * countOfStudents + priceOfBelts * (countOfStudents - freeBelts);
       // System.out.println(neededMoney);
        if(neededMoney<=amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.%n", neededMoney);
        }
        else{
            System.out.printf("George Lucas will need %.2flv more.%n", neededMoney-amountOfMoney);
        }
    }
}
