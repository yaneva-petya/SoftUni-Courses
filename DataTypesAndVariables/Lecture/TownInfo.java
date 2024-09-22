package DataTypesAndVariables.Lecture;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String town=s.nextLine();
        long population=Integer.parseInt(s.nextLine());
        long area=Integer.parseInt(s.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, population,area);
    }
}
