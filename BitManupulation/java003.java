package BitManupulation;

public class java003 {

    public static void main(String[] args) {
        // int x=7;
        // System.out.println(x^x);
        int x=3;
        int y=7;
        //swap using xor
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x is: "+x+" y is:"+y);
    }
}