package conditional;

import java.util.Scanner;

public class java001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.print("Enter a number (or type 'exit' to quit): ");
            String input=sc.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("Program terminated");
                break;
            }
            try{
                int number=Integer.parseInt(input);

                if(number>0){
                    System.out.println("Number is Positive");
                }else if(number<0){
                    System.out.println("Number is Negative");
                }else{
                    System.out.println("Number is zero");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a valid number or type 'exit' to quit" );
            }
        }
        sc.close();
    }
}
