package LoopsAndPatterns;

import java.util.Scanner;

public class java002 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to print table: ");
        int n=sc.nextInt();
        System.out.println("Table of "+n+" is : ");
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
