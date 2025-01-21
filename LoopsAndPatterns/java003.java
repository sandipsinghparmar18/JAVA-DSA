package LoopsAndPatterns;

import java.util.Scanner;

public class java003 {
    public static void hollowRectangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 ||  i==n || j==n || j==1 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void invertedAndRotatedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void invertedAndHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floydsTraingle(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to print pattern : ");
        int n=sc.nextInt();
        //hollowRectangle(n);
        //invertedAndRotatedHalfPyramid(n);
        //invertedAndHalfPyramid(n);
        floydsTraingle(n);
    }
}
