package Array2d;
public class java001 {

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,7,6},{7,8,9}};
        int count=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("The number of 7's in the array is: "+count);
    }
}