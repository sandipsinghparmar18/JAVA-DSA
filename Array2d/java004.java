package Array2d;

public class java004 {
    public static void printSpiral(int matrix[][]){
        int startRow=0,startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while (startCol<=endCol && startRow <=endRow) {
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            startRow++;
            //right
            for(int j=startRow;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            endCol--;
            //bottom
            for(int j=endCol;j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            endRow--;
            //left
            for(int i=endRow;i>startCol;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
        printSpiral(arr);
    }
}
