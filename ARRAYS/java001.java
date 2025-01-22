package ARRAYS;

import java.util.HashSet;

public class java001 {
    public static boolean distintcElement(int arr[]){
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
    public static void main(String[] args) {
        int arr[]={1,3,5,1};
        if(distintcElement(arr)){
            System.out.println("All Element in Arr are Not Uniue");
        }else{
            System.out.println("All Element in Arr are uniue");
        }
    }
}
