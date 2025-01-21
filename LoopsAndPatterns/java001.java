package LoopsAndPatterns;

import java.util.Scanner;

public class java001 {
    public static int facto(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number to find the factorial: ");
        int num=sc.nextInt();
        System.out.println("Factorial of a number is: "+facto(num));
    }
}