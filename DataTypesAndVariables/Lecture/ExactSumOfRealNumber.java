package DataTypesAndVariables.Lecture;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumber {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        BigDecimal sum=new BigDecimal(0);
        for(int i=1;i<=n;i++)
        {
            BigDecimal currentNum=new BigDecimal(s.nextLine());
            sum=sum.add(currentNum);
        }
        System.out.println(sum);
    }

}
