import java.util.Scanner;

/**
 * texCalculator
 */
public class texCalculator {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your salary to calculate your tax.");
        int salary =sc.nextInt();
        int tax=0;

        if(salary<500000){
            System.out.println("No need to pay tax. You are tax free.");
        }else if(salary<1000000){
            tax=(int)( salary*0.05);
        }else{
            tax=(int)(salary*0.1);
        }

        System.out.println("tax of your salary is :"+ tax ) ;
    }
}