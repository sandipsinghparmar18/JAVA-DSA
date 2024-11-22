import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SearchAndSorting {
    static List<Integer> commonElements(int a[],int b[],int c[]){
        List<Integer>list=new ArrayList<>();
        int x=0,y=0,z=0;
        while(x<a.length && y<b.length && z<c.length){
            if(a[x]==b[y] && b[y]==c[z]){
                list.add(a[x]);
                x++;
                y++;
                z++;
            }else if(a[x]>b[y]){
                y++;
            }else if(b[y]>c[z]){
                z++;
            }else{
                x++;
            }
        }
        return list;
    }

    static int majorityElement(int[] arr) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;
        int freq=1;

        // Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
                freq++;
            } else {
                count--;
            }
        }

        // Validate the candidate
        // count = 0;
        // for (int num : arr) {
        //     if (num == candidate) {
        //         count++;
        //     }
        // }
    
          // If count is greater than n / 2, return the candidate; otherwise, return -1
        if (freq > n / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    static List<Integer> duplicates(int nums[]){
        int n=nums.length;
        int arr[]=new int[n];

        List<Integer>list=new ArrayList<>();

        for(int i:nums){
            if(++arr[i]>1){
                list.add(i);
            }
        }
        return list;
    }

    static boolean sortArr(int arr[]){
        int n=arr.length;
        if(n==1){
            return true;
        }
        int x=-1;
        int y=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                if(x==-1){
                    x=i;
                }
                y=i+1;
            }
        }
        if(x!=-1){
            reverse(arr,x,y);
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
    static void reverse(int arr[],int x,int y){
        while(x<y){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
    }

    static List<List<Integer>> fourSum(int arr[],int target){
        List<List<Integer>> result=new ArrayList<>();
        int n=arr.length;
        if(arr==null || n<4) return result;
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            //ignore duplicate
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;

                int left=j+1;
                int right=n-1;

                while(left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target){
                        result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                        left++;
                        right--;

                        while(left<right && arr[left]==arr[left-1]) left++;
                        while(left<right && arr[right]==arr[right+1]) right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] A = { 1, 5, 10, 20, 30 };
        // int[] B = { 5, 13, 15, 20 };
        // int[] C = { 5, 20 };

        // List<Integer> common = commonElements(A, B, C);

        // System.out.print("Common Elements: ");
        // for (int ele : common) {
        //     System.out.print(ele + " ");
        // }

        // int[] arr = {1,2,1,3,2,2,2};
        // System.out.println(majorityElement(arr));
        // int[] a = {1, 6, 5, 2, 3, 3, 2};
        // List<Integer> duplicatesFound = duplicates(a);
        
        // System.out.print("Duplicate elements: ");
        // for (int element : duplicatesFound) {
        //     System.out.print(element + " ");
        // }
        // System.out.println();

        // int arr[] = { 1, 2, 5,  4,3, }; 
  
        // if(sortArr(arr)) 
        // { 
        //   System.out.println("Yes"); 
        // } 
        // else
        // { 
        //   System.out.println("No"); 
        // } 

        int[] array1 = {0, 1, 0, 2, 1};
        int target1 = 3;
        System.out.println(fourSum(array1, target1));

        
        int[] array2 = {10, 2, 3, 4, 5, 7, 8};
        int target2 = 23;
        System.out.println(fourSum(array2, target2));

        int[] array3 = {1, 1, 1, 1, 1, 1};
        int target3 = 4;
        System.out.println(fourSum(array3, target3));
    }
}
