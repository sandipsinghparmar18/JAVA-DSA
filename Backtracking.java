import java.util.ArrayList;
import java.util.HashMap;

public class Backtracking {

    static void solve(int i,int j,int [][]a,int n,ArrayList<String>ans,String move,int vis[][]){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return;
        }
        //down
        if(i+1<n && vis[i+1][j]==0 && a[i+1][j]==1){
            vis[i][j]=1;
            solve(i+1, j, a, n, ans, move+'D', vis);
            vis[i][j]=0;
        }
        //left
        if(j-1>=0 && vis[i][j-1]==0 && a[i][j-1]==1){
            vis[i][j]=1;
            solve(i, j-1, a, n, ans, move+'L', vis);
            vis[i][j]=0;
        }
        //right
        if(j+1<n && vis[i][j+1]==0 && a[i][j+1]==1){
            vis[i][j]=1;
            solve(i, j+1, a, n, ans, move+'R', vis);
            vis[i][j]=0;
        }
        //Upward
        if(i-1>=0 && vis[i-1][j]==0 && a[i-1][j]==1){
            vis[i][j]=1;
            solve(i-1, j, a, n, ans, move+'U', vis);
            vis[i][j]=0;
        }
    }
    static String ans="";
    static int mindiff=Integer.MAX_VALUE;
    static void thugOfWar(int []arr,int vidx,ArrayList<Integer>set1,ArrayList<Integer>set2,int sumOfSet1,int sumOfSet2){
        if(vidx==arr.length){
            int delta=Math.abs(sumOfSet1-sumOfSet2);
            if(delta<mindiff){
                mindiff=delta;
                ans=set1+" "+set2;
            }
        }
        if(set1.size()<(arr.length+1)/2){
            set1.add(arr[vidx]);
            thugOfWar(arr, vidx+1, set1, set2, sumOfSet1+arr[vidx], sumOfSet2);
            set1.remove(set1.size()-1);
        }
        if(set2.size()<(arr.length+1)/2){
            set2.add(arr[vidx]);
            thugOfWar(arr, vidx+1, set1, set2, sumOfSet1, sumOfSet2+arr[vidx]);
            set2.remove(set2.size()-1);
        }
    }
    static String max="0";
    static void findMaximumNum(String str,int k){
        if(Integer.parseInt(str)>Integer.parseInt(max)){
            max=str;
        }
        if(k==0){
            return;
        }
        for(int i=0;i<str.length()-1;i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j)>str.charAt(i)){
                    String swapped=swap(str,i,j);
                    findMaximumNum(swapped, k-1);
                }
            }
        }
    }
    static String swap(String str,int i,int j){
        char ith=str.charAt(i);
        char jth=str.charAt(j);

        String left=str.substring(0, i);
        String middle=str.substring(i+1, j);
        String right=str.substring(j+1);

        return left+jth+middle+ith+right;
    }
    static void solution(String unique,int idx,HashMap<Character,Integer>charIntMap,boolean[]usedNumbers,String s1,String s2,String s3){
        //base case
        if(idx==unique.length()){
            int num1=getNum(s1,charIntMap);
            int num2=getNum(s2,charIntMap);
            int num3=getNum(s3,charIntMap);
            if(num1+num2==num3){
                for(int i=0;i<26;i++){
                    char ch=(char)('a'+i);
                    if(charIntMap.containsKey(ch)){
                        System.out.print(ch+"-"+charIntMap.get(ch)+" ");
                    }
                }
                System.out.println();
            }
            return;
        }
        char ch=unique.charAt(idx);
        for(int num=0;num<=9;num++){
            if(usedNumbers[num]==false){
                charIntMap.put(ch, num);
                usedNumbers[num]=true;
                solution(unique, idx+1, charIntMap, usedNumbers, s1, s2, s3);
                usedNumbers[num]=false;
                charIntMap.put(ch, -1);
            }
        }
    }
    static int getNum(String s,HashMap<Character,Integer>charIntMap){
        String num="";
        for(int i=0;i<s.length();i++){
            num+=charIntMap.get(s.charAt(i));
        }
        return Integer.parseInt(num);
    }

    static void findPaths(int [][]maze,int x,int y,ArrayList<String>path,boolean[][] visited){
        int n=maze.length;
        int mid=n/2;
        //base case
        if(x==mid && y==mid){
            for(String step:path){
                System.out.print(step+"->");
            }
            System.out.println("MID");
            return;
        }
        if(x<0 || y<0 || x>=n || y>=n || visited[x][y]){
            return;
        }
        visited[x][y]=true;
        path.add("("+x+","+y+")");
        int steps=maze[x][y];

        //try to move all direction
        if(x+steps<n){
            findPaths(maze, x+steps, y, path, visited);
        }
        if(x-steps>=0){
            findPaths(maze, x-steps, y, path, visited);
        }
        if(y+steps<n){
            findPaths(maze, x, y+steps, path, visited);
        }
        if(y-steps>=0){
            findPaths(maze, x, y-steps, path, visited);
        }

        //backtrack
        visited[x][y]=false;
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        // int[][] a = {
        //     {1, 0, 0, 0},
        //     {1, 1, 0, 1},
        //     {0, 1, 0, 0},
        //     {1, 1, 1, 1}
        // };
        // int n = 4;
        // ArrayList<String> ans = new ArrayList<>();
        // int[][] vis = new int[n][n];

        // solve(0, 0, a, n, ans, "", vis);

        // System.out.println(ans);

        // int arr[] = {23, 45, -34, 12, 0, 98, 
        //     -99, 4, 189, -1};
        // thugOfWar(arr,0,new ArrayList<>(),new ArrayList<>(),0,0);
        // System.out.println(ans);

        // String str = "129814999";
        // int k = 4;
        // findMaximumNum(str, k);
        // System.out.println(max);


        // String s1="send";
        // String s2="more";
        // String s3="money";

        // HashMap<Character,Integer>charIntMap=new HashMap<>();
        // String unique="";

        // for(int i=0;i<s1.length();i++){
        //     if(!charIntMap.containsKey(s1.charAt(i))){
        //         charIntMap.put(s1.charAt(i), -1);
        //         unique+=s1.charAt(i);
        //     }
        // }
        // for(int i=0;i<s2.length();i++){
        //     if(!charIntMap.containsKey(s2.charAt(i))){
        //         charIntMap.put(s2.charAt(i), -1);
        //         unique+=s2.charAt(i);
        //     }
        // }
        // for(int i=0;i<s3.length();i++){
        //     if(!charIntMap.containsKey(s3.charAt(i))){
        //         charIntMap.put(s3.charAt(i), -1);
        //         unique+=s3.charAt(i);
        //     }
        // }
        // boolean[] usedNumbers=new boolean[10];
        // solution(unique,0,charIntMap,usedNumbers,s1,s2,s3);


        int[][] maze = {
            {3, 5, 4, 4, 7, 3, 4, 6, 3},
            {6, 7, 5, 6, 6, 2, 6, 6, 2},
            {3, 3, 4, 3, 2, 5, 4, 7, 2},
            {6, 5, 5, 1, 2, 3, 6, 5, 6},
            {3, 3, 4, 3, 0, 1, 4, 3, 4},
            {3, 5, 4, 3, 2, 2, 3, 3, 5},
            {3, 5, 4, 3, 2, 6, 4, 4, 3},
            {3, 5, 1, 3, 7, 5, 3, 6, 4},
            {6, 2, 4, 3, 4, 5, 4, 5, 1}
        };

        int n = maze.length;
        boolean[][] visited = new boolean[n][n];

        ArrayList<String> path = new ArrayList<>();

        // Try all four corners as starting points
        System.out.println("Paths from (0, 0):");
        findPaths(maze, 0, 0, path, visited);
    }
}
