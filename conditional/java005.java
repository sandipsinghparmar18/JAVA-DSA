package conditional;

import java.util.Scanner;

public class java005 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum+=num%10;
            num /=10;
        }
        System.out.println(sum);
    }
}