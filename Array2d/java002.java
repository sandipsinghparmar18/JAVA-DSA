package Array2d;

public class java002 {
    public static void main(String[] args) {
        int nums[][]={{1,4,9},{11,4,3},{7,8,9}};
        int sum=0;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
        
        System.out.println("The sum of the second row is: "+sum);
    }
}
