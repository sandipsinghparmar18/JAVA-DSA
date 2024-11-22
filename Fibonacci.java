import java.util.HashMap;

public class Fibonacci {
    private static HashMap<Integer,Integer>memo=new HashMap<>();

    static int fibonacciRecursion(int n){
        if(n<=1){
            return n;
        }
        return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }

    static int fibonacciIterative(int n){
        if(n<=1) return n;

        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }

    static int fibonacciMemorization(int n){
        if(n<=1) return n;

        if(memo.containsKey(n)) return memo.get(n);

        int result=fibonacciMemorization(n-1)+fibonacciMemorization(n-2);
        memo.put(n, result);

        return result;

    }

    static int fibonacciDynamic(int n){
        if(n<=1) return n;

        int fib[]=new int[n+1];
        fib[0]=0;
        fib[1]=1;

        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("fibonacci series is:"+fibonacciDynamic(n));
        for(int i=0;i<=n;i++){
            System.out.print(fibonacciDynamic(i)+" ");
        }
    }
}
