package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class java005 {
   public static List<Integer> findSteppingNumbers(int n,int m){
    List<Integer> result=new ArrayList<>();
    for(int i=0;i<=9;i++){
        bfs(n,m,i,result);
    }
    return result;
   }
   public static void bfs(int n,int m,int num,List<Integer> result){
    Queue<Integer> queue=new LinkedList<>();
    queue.add(num);
    while (!queue.isEmpty()) {
        int stepNum=queue.poll();
        if(stepNum >= n && stepNum <=m){
            result.add(stepNum);
        }
        if(stepNum==0 || stepNum>m){
            continue;
        }
        int lastDigit=stepNum%10;

        int nextLow=stepNum*10 + (lastDigit-1);
        int nextHigh=stepNum*10 +(lastDigit+1);

        if(lastDigit>0) queue.add(nextLow);
        if (lastDigit<9) queue.add(nextHigh);
    }
   }
    public static void main(String[] args) {
        List<Integer> result = findSteppingNumbers(100, 500);
        Collections.sort(result);
        System.out.println("Stepping Numbers: " + result);
    }
}
