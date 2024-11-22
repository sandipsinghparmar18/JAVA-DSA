import java.util.ArrayList;

public class HEAP {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x=arr.size()-1; //child 
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public int remove(){
            int data=arr.get(0);
            //1-swap 1st and last
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            //2-delete last
            arr.remove(arr.size()-1);
            //3-heapify
            heapify(0);
            return data;
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int mxIdx=i;

            if(left<arr.size() && arr.get(mxIdx)>arr.get(left)){
                mxIdx=left;
            }
            if(right<arr.size() && arr.get(mxIdx)>arr.get(right)){
                mxIdx=right;
            }
            if(mxIdx != i){
                //swap
                int temp=arr.get(i);
                arr.set(i, arr.get(mxIdx));
                arr.set(mxIdx, temp);
                heapify(mxIdx);
            }
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap pq=new Heap();
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
