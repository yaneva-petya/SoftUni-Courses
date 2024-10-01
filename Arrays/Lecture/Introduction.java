package Arrays.Lecture;

import java.util.Arrays;
import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        //Arrays are static collection!
       int []days=new int[7];
       //System.out.printf("Length of the array:%d%n",days.length);

       //1.how to add elements in the array - when we do not know the elements;
        days[0]=1;
        days[1]=2;
        days[2]=3;

        //how to see the last element in the array;
        //System.out.printf("Last element in the array:%d%n",days.length-1);

        String []months=new String[12];
       // System.out.println(months.length);

        //how to reach an element in the array;
       //System.out.println(days[0]);//days[0]->1;

        String name="Stoyan";

        //"Stoyan".toCharArray()->['S','t','o','y','a','n'];
        char []letters=name.toCharArray();//here it does not necessary to write the length of the array;
        //System.out.println(letters.length);
        //System.out.println(letters[letters.length]);//index out of bounds;
        //System.out.println(letters[letters.length-1]);//last element in the array;
        //2.how to write elements in the array;
        String []weekDays={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //how to format elements in the array;
        //System.out.printf("%s", weekDays[0]);
        //System.out.println(weekDays);//it gives us an address;

        /*for(int i=0; i<weekDays.length;i++){
            System.out.println(weekDays[i]);
        }*/

        //while, for - repeat action;
        //Foreach -> repeat action like while and for, but it is used to go through every arrays' element;
        /*for(String day:weekDays){
           System.out.println(day);
        }*/

        /*for(int number: days){
            System.out.println(number);
        }*/

        int n =Integer.parseInt(s.nextLine());

        int[] array = new int[n];

        for(int i=0;i<array.length;i++){
            array[i]=Integer.parseInt(s.nextLine());
        }

        for(int num:array){
            System.out.println(num);
        }

        //String input="1 2 3 4 5";

        //String[] num=input.split(" ");//It returns an array of Strings;

        /*int[] numbers=new int[num.length];
        for(int i=0;i< numbers.length;i++){
            numbers[i]=Integer.parseInt(num[i]);
        }*/

        int[] numbers= Arrays.stream(s.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        double[] salaries=Arrays.stream(s.nextLine()
                        .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for(int k:numbers){
            System.out.printf("%d%n", k);
        }

    }
}
