import java.util.Scanner;

public class PrimeNumber {
    static void primeNumber(int num){
        boolean isPrime=true;
        if(num==0 || num==1){
            isPrime=false;
        }
        if(num==2){
            isPrime=true;
        }

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("number is PRIME");
        }else{
            System.out.println("not PRIME");
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter to check number is prime or not!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        primeNumber(num);
    }
}
