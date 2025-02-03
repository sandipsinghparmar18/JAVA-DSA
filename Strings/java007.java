package Strings;

import java.util.Arrays;

public class java007 {
    public static boolean Anagrams(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length() != str2.length()){
            return false;
        }else{
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        System.out.println(Anagrams(str1,str2));
    }
}
