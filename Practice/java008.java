// package Practice;
// class Process1 implements Runnable{
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Process 1 "+i);
//         }
//     }
// }
// class Process2 implements Runnable {
//     public void run(){
//         for(int i=0;i<10;i++){
//             System.out.println("Process 2 "+i);
//         }
//     }
// }
// public class java008 {
//     public static void main(String[] args) {
//         Process1 p1=new Process1();
//         Process2 p2=new Process2();
//         Thread t1=new Thread(p1);
//         Thread t2=new Thread(p2);
//         t1.start();
//         t2.start();   
//     }
// }


package Practice;
class Process1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Process 1: "+i);
        }
    }
}
class Process2 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Process 2: "+i);
        }
    }
}
public class java008 {
    public static void main(String[] args) {
        Process1 p1=new Process1();
        Process2 p2=new Process2();
        p1.start();
        p2.start();   
    }
}