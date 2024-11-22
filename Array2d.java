import java.util.HashMap;

public class Array2d {
    static int commonElements(int[][] mat,int r,int c){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int j=0;j<c;j++){
            map.put(mat[0][j], 1);
        }
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                if(map.containsKey(mat[i][j]) && map.get(mat[i][j])==i){
                    map.put(mat[i][j], i+1);
                }
            }
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==r){
                return key;
            }
        }
        return -1;
    }

    static void fill0X(int row,int col){
        int left=0,right=col-1,top=0,bottom=row-1;
        char a[][]=new char[row][col];
        char x = 'X';

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                a[top][i]=x;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                a[i][right]=x;
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    a[bottom][i]=x;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    a[i][left]=x;
                }
                left++;
            }
            x = (x == '0')? 'X': '0';
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            // 
            // int[][] mat = {
            //     {1, 2, 3, 4},
            //     {2, 4, 5, 8},
            //     {2, 4, 6, 8},
            //     {2, 4, 7, 8}
            // };
    
            // int result = commonElements(mat, mat.length, mat[0].length);
            
            // if (result != -1) {
            //     System.out.println("First common element: " + result);
            // } else {
            //     System.out.println("No common element found.");
            // }

            // System.out.println("Output for m = 5, n = 6");
            // fill0X(5, 6);
    }
}
