package Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class java004 {
    private static int secondLaargest(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num > first){
                second=first;
                first=num;
            }else if(num > second && num < first){
                second=num;
            }
        }
        return second;
    }
    private static boolean checkPalindrom(String str){
        int left=0;
        int right=str.length()-1;
        while (left<right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private static char firstNonRepeatingCharacter(String str){
        Map<Character,Integer>countMap=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0)+1);
        }
        for(char c: countMap.keySet()){
            if(countMap.get(c)==1) return c;
        }
        return '_';
    }

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        // System.out.println(secondLaargest(arr));

        // String str="abcdcbad";
        // System.out.println(checkPalindrom(str));

        String str="SandipSinghParmar";
        System.out.println(firstNonRepeatingCharacter(str));
    }
}
