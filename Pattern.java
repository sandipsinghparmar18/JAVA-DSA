public class Pattern {
    static void starPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void inversStarPattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void halfPyramidPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void characterPattern(int n){
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    static void hollowRectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
    }

    static void invertedRottedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void invertedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void floyedTrainglePatterns(int n){
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }

    static void zeroOnePatterns(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }

    public static void buterfly(int n){
        //first half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //second half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            for(int j=2*i-2;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void solidRhomBus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static void holoSolidRhomBus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //starPattern(4);
        //inversStarPattern(4);
        //halfPyramidPattern(4);
        //characterPattern(4);
        // hollowRectangle(4,5);
        // invertedRottedHalfPyramid(4);
        // invertedHalfPyramid(5);
        // floyedTrainglePatterns(5);
        // zeroOnePatterns(5);
        // buterfly(4);
        // solidRhomBus(5);
        holoSolidRhomBus(5);
        
    }
}
