package JAVASWINGS;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginS extends JFrame {
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    LoginS(String s){
        super(s);
    }
    LoginS(){

    }
    void setComponents(){
        l1=new JLabel("Welcome to Coding Seekho");
        l2=new JLabel("USERNAME");
        l3=new JLabel("PASSWORD");
        l4=new JLabel();
        t1=new JTextField();
        t2=new JPasswordField();
        b1=new JButton("Login");
        b2=new JButton("Clear");
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        l1.setBounds(100,50,300,30);
        l2.setBounds(100,200,100,30);
        l3.setBounds(100,350,100,30);
        l4.setBounds(100,550,100,30);
        t1.setBounds(350,200,100,30);
        t2.setBounds(350,350,100,30);
        b1.setBounds(200,450,100,30);
        b2.setBounds(400,450,100,30);
        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
    }
    
    public static void main(String[] args) {
        LoginS s1= new LoginS("Welcome to java World");
        s1.setVisible(true);
        s1.setSize(700,700);
        s1.setComponents();
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    class Log implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            String s1=t1.getText();
            String s2=t2.getText();
            if(s1.equals("coding") && s2.equals("seekho")){
                l4.setText("Login Successfull");
            }else{
                l4.setText("Login failed");
            }
        }
    }
    class Clear implements ActionListener{
        public void actionPerformed(ActionEvent e1){
            t1.setText("");
            t2.setText("");
        }
    }
}
