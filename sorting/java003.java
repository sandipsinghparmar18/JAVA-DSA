package sorting;

import java.util.Arrays;

public class java003 {
    public static void insertionSort(int nums[]){
        int n=nums.length;
        for(int i=1;i<n;i++){
            int key=nums[i];
            int j=i-1;

            while (j>=0 && nums[j] > key) {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
    }
    public static void main(String[] args) {
         int[] nums = {12, 11, 13, 5, 6};
        System.out.println("Original array: " + Arrays.toString(nums));

        insertionSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }
}
