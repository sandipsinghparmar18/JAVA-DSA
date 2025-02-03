package Strings;

import java.util.Scanner;

public class java005 {
    public static int findLowercaseVowel(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to lowercase vowels : ");
        String str=sc.nextLine();
        System.out.println(findLowercaseVowel(str));
        sc.close();
    }
}
