package Arrays.Lecture;

import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input=s.nextLine().split(" ");;


        for(int i=0;i<input.length/2;i++){

            String currentElement=input[i];
            input[i]=input[input.length-1-i];
            input[input.length-1-i]=currentElement;

        }

       /* for(String el:input){
            System.out.print(el+" ");
        }*/
        System.out.println(String.join(" ", input));
    }
}
