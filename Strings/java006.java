package Strings;

public class java006 {
    public static void main(String[] args) {
        String s1=new String("Hello"); //refer object in heap
        String s2=s1.intern();                 // refer object in SCP (String Constant Pool)
        System.out.println(s1==s2);          //comparing memory location
        System.out.println(s1.equals(s2));   //comparing value
        String s3="Hello";
        System.out.println(s2==s3);    //comparing in SCP 
    }
}
