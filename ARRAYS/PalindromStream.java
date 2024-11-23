package ARRAYS;

import java.util.ArrayList;
import java.util.List;

public class PalindromStream {
    private static boolean isPalindrom(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void checkPalindromeStream(String input){
        StringBuilder currString=new StringBuilder();
        for(char ch:input.toCharArray()){
            currString.append(ch);
            if(isPalindrom(currString.toString())){
                System.out.println(ch+":- YES");
            }else{
                System.out.println(ch+":- NO");
            }
        }
    }

    public static List<Boolean> checkPalindromeQueries(String input,int [][] queries){
        List<Boolean>result=new ArrayList<>();
        for(int[] query:queries){
            int start=query[0];
            int end=query[1];
            String str=input.substring(start,end+1);
            result.add(isPalindrom(str));
        }
        return result;
    }
    public static void main(String[] args) {
        // String input1 = "abcba";
        // String input2 = "aabaacaabaa";

        // System.out.println("Output for input1:");
        // checkPalindromeStream(input1);

        // System.out.println("\nOutput for input2:");
        // checkPalindromeStream(input2);
        

        String input = "abaaabaaaba";
        int[][] queries = {
            {0, 10},
            {5, 8},
            {2, 5},
            {5, 9}
        };
        
        List<Boolean> results = checkPalindromeQueries(input, queries);
        
        for (int i = 0; i < queries.length; i++) {
            System.out.println("Query " + queries[i][0] + " to " + queries[i][1] + ": " + (results.get(i) ? "Palindrome" : "Not a Palindrome"));
        }
    }
}
