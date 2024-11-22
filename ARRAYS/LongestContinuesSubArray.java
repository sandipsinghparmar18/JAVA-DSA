package ARRAYS;

import java.util.HashSet;

public class LongestContinuesSubArray {
    public static int findLongestSubarray(int arr[]){
        int mxLen=0;
    
        for(int i=0;i<arr.length;i++){
            HashSet<Integer>uniueElement=new HashSet<>();
            int mxElement=arr[i];
            int minElement=arr[i];

            for(int j=i;j<arr.length;j++){
                if(uniueElement.contains(arr[j])){
                    break;
                }
                uniueElement.add(arr[j]);
                minElement=Math.min(minElement, arr[j]);
                mxElement=Math.max(mxElement, arr[j]);

                if(mxElement-minElement==j-i){
                    mxLen=Math.max(minElement, j-i+1);
                }
            }
        }
        return mxLen;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 12, 11};
        int[] arr2 = {10, 12, 12, 10, 10, 11, 10};

        System.out.println("Length of longest contiguous subarray in arr1: " + findLongestSubarray(arr1));
        System.out.println("Length of longest contiguous subarray in arr2: " + findLongestSubarray(arr2));
    }
}
