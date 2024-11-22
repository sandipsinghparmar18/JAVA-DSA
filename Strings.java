import java.util.*;
public class Strings {
    static String printSequence(String input){
        String arr[]={
            "2","22","222","3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" 
        };
        input=input.toUpperCase();
        String output="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                output+="0";
            }else{
                output+=arr[input.charAt(i)-'A'];
            }
        }
        return output;
    }

    static void printDups(String str){
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        //iteration on map
        for(Map.Entry<Character,Integer> mapElement: map.entrySet()){
            if(mapElement.getValue()>1){
                System.out.println(mapElement.getKey()+", count= "+mapElement.getValue());
            }
        }
    }
    public final static int d=256;
    public static void search(String pat,String txt,int q){
        int M=pat.length();
        int N=txt.length();
        int i,j;
        int p=0;  //hash value of pattern
        int t=0; //hash value of txt
        int h=1;

        for(i=0;i<M-1;i++){
            h=(h*d)%q;
        }
        //catculate the hash value of pat and txt
        for(i=0;i<M;i++){
            p=(d*p+pat.charAt(i))%q;
            t=(d*t+txt.charAt(i))%q;
        }

        //find patern in txt one by one
        for(i=0;i<N-M;i++){
            if(p==t){
                for(j=0;j<M;j++){
                    if(txt.charAt(i+j) != pat.charAt(j))
                        break;
                }
                if(j==M){
                    System.out.println("pattern found at index- "+i);
                }
            }
            if(i<N-M){
                t=(d*(t-txt.charAt(i)*h)+txt.charAt(i+M))%q;
                if(t<0)
                    t=(t+q);
            }
        }
    }

    static int transform(String a,String b){
        if(a.length()!=b.length()) return -1;
        int n=a.length();

        ////O(n) space
        // HashMap<Character,Integer>map=new HashMap<>();
        // int n=a.length();
        // for(int i=0;i<n;i++){
        //     map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0)+1);
        // }
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(b.charAt(i))){
        //         map.put(b.charAt(i), map.get(b.charAt(i))-1);
        //     }
        // }
        // for(Map.Entry<Character,Integer> entry:map.entrySet()){
        //     if(entry.getValue()!=0) 
        //         return -1;
        // }

        //O(1) Space
        int count[]=new int[256];
        for(int i=0;i<n;i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }

        for(int i=0;i<256;i++){
            if(count[i] != 0){
                return -1;
            }
        }

        int i=n-1;
        int j=n-1;
        int res=0;

        while(i>=0){
            if(a.charAt(i) != b.charAt(j)){
                res++;
            }else{
                j--;
            }
            i--;
        }
        return res;
    }

    static void printMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void diagonalOrder(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        for(int line=1;line<=(row+col-1);line++){
            int start_col=max(0,line-row);
            int count=min(line,(col-start_col),row);
            for(int j=0;j<count;j++){
                System.out.print(matrix[min(row,line)-j-1][start_col+j]+" ");
            }
            System.out.println();
        }
    }
    static int min(int a,int b){
        return (a<b) ? a:b;
    }
    static int min(int a,int b,int c){
        return min(min(a, b),c);
    }
    static int max(int a,int b){
        return (a>b) ? a:b;
    }
    public static void main(String[] args) {
        // String sentence = "HELLO WORld";
        // String result=printSequence(sentence);
        // System.out.println(result);
        // String str = "test string";
        // printDups(str);
        // String txt = "GEEKS FOR GEEKS";
        // String pat = "GEEK";
 
        // // A prime number
        // int q = 101;
 
        // // Function Call
        // search(pat, txt, q);

        // String A = "EACBD";
        // String B = "EABCD";
 
        // System.out.println(
        //     "Minimum number of operations required is "
        //     + transform(A, B));

        // int M[][] = { 
        //     { 1, 2, 3, 4 },     { 5, 6, 7, 8 }, 
        //     { 9, 10, 11, 12 },  { 13, 14, 15, 16 }, 
        //     { 17, 18, 19, 20 }, 
        // }; 
        // System.out.print("Given matrix is \n"); 
        // printMatrix(M); 
  
        // System.out.print( 
        //     "\nDiagonal printing of matrix is \n"); 
        // diagonalOrder(M); 

        
    }
}
