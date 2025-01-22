package conditional;

import java.util.Scanner;

public class java006 {
    public static boolean isPalindrome(int num){
        int palindrome=num;
        int reverse=0;

        while (palindrome != 0) {
            int remainder=palindrome%10;
            reverse=reverse*10 +remainder;
            palindrome /=10;
        }
        if(num==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("Number "+num+" is Palindrom");
        }else{
            System.out.println("Number "+num+" is Not Palindrome");
        }
    }
}
