package bank.management.systems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10, 100, 100);
        add(label);
        
        
        JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("Railway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
       
                
       
                
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Railway",Font.BOLD,28));
        pin.setBounds(120,190,400,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,190,230,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        login = new JButton("Sign in");
        login.setBounds(300,260,80,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
                
        clear = new JButton("Clear");
        clear.setBounds(430,260,80,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("Sign up");
        signup.setBounds(365,300,80,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
       
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource() == login){
            conn conn = new conn();
            String cardnumber = cardTextField.getText();
            String pinnumber  = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin  = '"+pinnumber+"' "; 
            
            try{
                
              ResultSet rs =  conn.s.executeQuery(query);
              if(rs.next()){
                  setVisible(false);
                  new Transactions(pinnumber).setVisible(true);
              }else{
                  JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
              }
                
            }catch (Exception e){
                System.out.println(e);
            }
        }else if(ae.getSource() == signup){
            setVisible(false);
            new signupone().setVisible(true);
            
        }
        
    
    }
    public static void main(String args[]){
        new Login();
    }
    
}
