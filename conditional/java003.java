package conditional;

import java.util.Scanner;

public class java003 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter year to check leap year or not : ");
        int year=sc.nextInt();
        if((year%4==0 && year%100 !=0) || (year%400==0)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
}
