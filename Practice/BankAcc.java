package Practice;

import java.util.Scanner;

class Account{
    int bal;
    public Account(int bal){
        this.bal=bal;
    }
    public boolean isSufficientBal(int w){
        if(bal>w){
            return true;
        }else{
            return false;
        }
    }
    public void withdrow(int amt,String user){
        if(isSufficientBal(amt)){
            bal-=amt;
            System.out.println("Withdrow SuccessFull");
            System.out.println(user+" Account current Balance is: "+bal);
        }else{
            System.out.println("Insuffient Ammout");
        }
    }
}
class Customer implements Runnable{
    Account a1;
    String user;
    public Customer(Account a1,String user){
        this.a1=a1;
        this.user=user;
    }
    public void run(){
        Scanner sc=new Scanner(System.in);
        synchronized(a1){
            System.out.println("Enter amount for withdrow in "+user+" Account: ");
            int amt=sc.nextInt();
            a1.withdrow(amt, user);
        }
    }
}
public class BankAcc {
    public static void main(String[] args) {
        Account ac=new Account(5000);
        Customer c1=new Customer(ac, "Sandip");
        Customer c2=new Customer(ac, "Rupesh");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
    }
}
