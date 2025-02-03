package BitManupulation;

public class java001 {
    public static void checkIfEvenOrOdd(int n){
        int bitMask=1;
        if((n & bitMask)==1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }
    public static void main(String[] args) {
        int n=4;
        checkIfEvenOrOdd(n);
    }
}
