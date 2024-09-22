package DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfPeople=Integer.parseInt(s.nextLine());
        int capacity = Integer.parseInt(s.nextLine());

        int courses=numberOfPeople/capacity;
        int extraCourses=numberOfPeople-(courses*capacity);
        if(extraCourses>0){
            System.out.println(courses+1);
        }
        else{
            System.out.println(courses);
        }

    }
}
