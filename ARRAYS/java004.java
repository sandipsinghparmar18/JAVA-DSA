package ARRAYS;

public class java004 {
    public static int trappedWater(int height[]){
        int n=height.length;

        int res=0,left=0,right=n-1;
        int rMax=height[right],lMax=height[left];

        while (left<right) {
            if(lMax<rMax){
                left++;
                lMax=Math.max(lMax, height[left]);
                res+=lMax-height[left];
            }else{
                right--;
                rMax=Math.max(rMax, height[right]);
                res+=rMax-height[right];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped water is: "+trappedWater(height));
    }
}
