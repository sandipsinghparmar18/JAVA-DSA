package Array2d;

public class java005 {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        //brute Force Aproach
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if((i+j)==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum+=matrix[i][i];
            //secondry daigonal
            if(i != matrix.length-1-i)//remove overlaping in 3*3 matrix
                sum+=matrix[i][matrix.length-i-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

        System.out.print(diagonalSum(arr));
    }
}
