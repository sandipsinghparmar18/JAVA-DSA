import java.util.Scanner;

public class Factorial {
    static int calcuFactorial(int num){
        if(num==0){
            return 1;
        }else{
            return num*calcuFactorial(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number to find factorial!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=calcuFactorial(num);
        System.out.println("Factorial is: "+fact);
    }
}
