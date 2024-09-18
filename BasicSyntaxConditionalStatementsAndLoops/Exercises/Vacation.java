package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=Integer.parseInt(s.nextLine());
        String people=s.nextLine();
        String day=s.nextLine();
        double price=0.0;

        switch (people) {
            case "Students" -> {
                if (day.equals("Friday")) {
                    price = 8.45 * n;
                } else if (day.equals("Saturday")) {
                    price = 9.80 * n;
                } else if (day.equals("Sunday")) {
                    price = 10.46 * n;
                }

                         }
            case "Business" -> {
                if (day.equals("Friday")) {
                    if (n >= 100) price = 10.9 * (n - 10);
                    else price = 10.9 * n;

                } else if (day.equals("Saturday")) {
                    if (n >= 100) price = 15.6 * (n - 10);
                    else price = 15.6 * n;

                } else if (day.equals("Sunday")) {
                    if (n >= 100) price = 16.0 * (n - 10);
                    else price = 16.0 * n;
                }
            }
            case "Regular" -> {
                if (day.equals("Friday")) {
                    price = 15.0 * n;
                } else if (day.equals("Saturday")) {
                    price = 20.0 * n;
                } else if (day.equals("Sunday")) {
                    price = 22.5 * n;
                }


            }
        }
            switch (people){
            case "Students" ->{
                if (n >= 30) price -= price * (15.0 / 100);
            }
            case "Regular" ->{
                if (n >= 10 && n<=20) price-=(price * (5.0 / 100));}
            }
        System.out.printf("Total price: %.2f%n", price);


    }
}
