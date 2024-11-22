import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Array {

    static void printArray(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }

    static int linearSearch(int num[],int val){
        for(int i=0;i<num.length;i++){
            if(num[i]==val){
                return i;
            }
        }
        return -1;
    }

    static int binarySeach(int num[],int val){
        int start=0,end=num.length;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==val){
                return mid;
            }
            if(num[mid]>val){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    static void reverseArray(int num[]){
        int start=0,end=num.length-1;
        while (start<end) {
            int temp=num[end];
            num[end]=num[start];
            num[start]=temp;
            start++;
            end--;
        }
    }

    static void pairsInArray(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + num[i] + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }

    static void subArrays(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    static void maxSubArraysSum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                int currSum=0;
                for(int k=i;k<=j;k++){
                    //System.out.print(num[k]+" ");
                    currSum+=num[k];
                }
                //System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum subarray Sum is: "+maxSum);
    }

    static void prefixMaxSubArraysSum(int num[]){
        int maxSum=Integer.MIN_VALUE;

        int prefix[]=new int[num.length];
        prefix[0]=num[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                int currSum=0;
                
                currSum = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum subarray Sum is: "+maxSum);
    }

    static void kaddansSubArraySum(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<num.length;i++){
            currSum+=num[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum, currSum);
        }
        System.out.println("Max sum of subarry is: "+maxSum);
    }

    static int trappedRainWater(int height[]){
        int n=height.length;
        //calculate left max boundry
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundry
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }

        return trappedWater;
    }

    static int buyAndSellStock(int price[]){
        int maxProfit=Integer.MIN_VALUE;
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>price[i-1]){
                profit=price[i]-price[i-1];
            }
            maxProfit=Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    static int maxProfitInStock(int price[]){
        int buy=price[0];
        int profit=0;

        for(int i=1;i<price.length;i++){
            if(buy<price[i]){
                profit=Math.max(price[i]-buy, profit);
            }else{
                buy=price[i];
            }
        }
        return profit;
    }

    static boolean containsDuplicate(int arr[]){
        //bruet force O(n logn)
        // Arrays.sort(arr);
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]==arr[i-1]){
        //         return true;
        //     }
        // }
        // return false;

        //using set O(n)
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;

    }


    static void minMaxInArray(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int left=0,right=arr.length-1;

        while(left<=right){
            min=Math.min(min, arr[left]);
            max=Math.max(max, arr[left]);
            min=Math.min(min, arr[right]);
            max=Math.max(max, arr[right]);
            left++;
            right--;
        }
        System.out.print("min value is:"+min+" max value is:"+max);
    }

    static boolean findPair(int arr[],int sum){
        //bruete force
        // Arrays.sort(arr);
        // int left=0;
        // int right=arr.length-1;
        // while (left<right) {
        //     int curr=arr[left]+arr[right];
        //     if(curr==sum){
        //         return true;
        //     }else if(curr<sum){
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }
        // return false;

        //optimize way
        int n=arr.length;
        int pivot=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                pivot=i+1;
                break;
            }
        }
        int left=pivot;
        int right=pivot-1;
        while (left != right) {
            if(arr[left]+arr[right]==sum){
                return true;
            }else if(arr[left]+arr[right]<sum){
                left=(left+1)%n;
            }else{
                right=(right-1+n)%n;
            }
        }
        return false;
    }

    public static void mergeOverlap(int arr[][]){
        Arrays.sort(arr, (a,b)-> Integer.compare(a[0], b[0]));
        int resIdx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[resIdx][1]>=arr[i][0]){
                arr[resIdx][1]=Math.max(arr[resIdx][1], arr[i][1]);
            }else{
                resIdx++;
                arr[resIdx]=arr[i];
            }
        }

        for(int i=0;i<resIdx+1;i++){
            System.out.print("[" +arr[i][0]+","+arr[i][1]+"]");
        }
    }

    static int findMinOps(int arr[],int n){
        int ans=0;
        for(int i=0,j=n-1;i<=j;){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else if(arr[i]<arr[j]){
                i++;
                arr[i]+=arr[i-1];
                ans++;
            }else{
                j--;
                arr[j]+=arr[j+1];
                ans++;
            }
        }
        return ans;
    }

    static String largestNumber(String[] arr){
        Comparator<String> myCompare=(X,Y)->(X+Y).compareTo(Y+X);

        Arrays.sort(arr,myCompare.reversed());

        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder result=new StringBuilder();
        for(String num:arr){
            result.append(num);
        }

        return result.toString();
    }

    static void printArray(int arr[],int r){
        for(int i=0;i<r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void printCombination(int arr[],int n,int r){
        int data[]=new int[r];
        Arrays.sort(arr);
        combinationUtil(arr,n,r,0,data,0);
    }

    static void combinationUtil(int arr[],int n,int r,int index,int data[],int i){
        if(index==r){
            printArray(data, r);
            return;
        }
        if(i>=n){
            return;
        }

        data[index]=arr[i];
        combinationUtil(arr, n, r, index+1, data, i+1);

        while (i<n-1 && arr[i]==arr[i+1]) {
            i++;
        }
        combinationUtil(arr, n, r, index, data, i+1);
    }
    public static void main(String[] args) {
        //int num[] ={2,4,6,8,10};
        //int num[]={1,-2,6,-1,3};
        // System.out.println(linearSearch(num, 8));
        //reverseArray(num);
        //printArray(num);
        //System.out.println(binarySeach(num, 9));
        //pairsInArray(num);
        //subArrays(num);
        //maxSubArraysSum(num);
        //prefixMaxSubArraysSum(num);
        //kaddansSubArraySum(num);
        // int height[]={4,2,0,6,3,2,5};
        // System.out.println(trappedRainWater(height));
        // int price[]={7,1,5,3,6,4};
        // System.out.println(buyAndSellStock(price));
        // System.out.println(maxProfitInStock(price));
        //System.out.println(containsDuplicate(num));
        // int arr[]={3,2,1,56,1000,167};
        // minMaxInArray(arr);
        // int[] arr = {11, 15, 6, 8, 9, 10};
        // int x = 16;
        // System.out.println(findPair(arr, x));
        // int[][] arr = { { 6, 8 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };
        // mergeOverlap(arr);
        // int arr[] = new int[]{1, 4, 5, 1};
        // System.out.println("Count of minimum operations is "+findMinOps(arr, arr.length));
        // String[] arr1 = { "3", "30", "34", "5", "9" };
        // System.out.println(
        //     largestNumber(arr1)); // Output: "9534330"

        // String[] arr2 = { "54", "546", "548", "60" };
        // System.out.println(
        //     largestNumber(arr2)); // Output: "6054854654"

        int arr[] = {1, 2, 1, 3, 1};
        int r = 3;
        int n = arr.length;
        printCombination(arr, n, r);
    }
}
