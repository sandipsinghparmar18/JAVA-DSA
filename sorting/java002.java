package sorting;

public class java002 {
    public static void selectionSort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14}; 
        selectionSort(arr);  
        System.out.println("After Selection sort:");  
        for (int num : arr) {  
            System.out.print(num + " ");  
        }  
    }
}
