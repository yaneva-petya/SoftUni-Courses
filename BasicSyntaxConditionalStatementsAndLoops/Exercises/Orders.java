package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int countIOfOrders=Integer.parseInt(s.nextLine());

        double totalSum=0.0;
        for(int i=1;i<=countIOfOrders;i++){
            double pricePerCapsule=Double.parseDouble(s.nextLine());
            int daysInMonth=Integer.parseInt(s.nextLine());
            int capsuleCount=Integer.parseInt(s.nextLine());
            double sum=((daysInMonth*capsuleCount)*pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n",sum );
            totalSum+=sum;
        }
        System.out.printf("Total: $%.2f%n", totalSum);
    }
}
