package Strings;

public class java002 {
    public static float getSortedPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='S'){
                y--;
            }else if(dir=='N'){
                y++;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println("Sortest path is: "+getSortedPath(str));
    }
}
