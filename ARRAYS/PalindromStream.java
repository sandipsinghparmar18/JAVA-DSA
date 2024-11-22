package ARRAYS;

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
    public static void main(String[] args) {
        String input1 = "abcba";
        String input2 = "aabaacaabaa";

        System.out.println("Output for input1:");
        checkPalindromeStream(input1);

        System.out.println("\nOutput for input2:");
        checkPalindromeStream(input2);
    }
}
