package Practice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class java006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Test Cases: ");
        int T=sc.nextInt();

        while (T-- > 0) {
            System.out.println("Enter number of Boxes: ");
            int N=sc.nextInt();
            PriorityQueue<Integer> minHeap=new PriorityQueue<>();

            for(int i=0;i<N;i++){
                int j=i+1;
                System.out.println("Box "+j+": ");
                minHeap.add(sc.nextInt());
            }
            int totalTime=0;
            while(minHeap.size()>1){
                int first=minHeap.poll();
                int second=minHeap.poll();
                int mergeTime=first+second;
                totalTime+=mergeTime;
                minHeap.add(mergeTime);
            }
            System.out.println(totalTime);
        }
        sc.close();
    }
}
