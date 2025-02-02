package bank.management.systems;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{
    JButton deposit,withdrawl,Fastcash,ministatement,pinchange,balaceenquiry,exit;
    String pinnumber;
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 =  i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please Select Your Transaction");
        text.setBounds(220,300,700,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawal");
        withdrawl.setBounds(350,415,150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        Fastcash = new JButton("Fast cash");
        Fastcash.setBounds(170,450,150,30);
        Fastcash.addActionListener(this);
        image.add(Fastcash);
        
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(350,450,150,30);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
         pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balaceenquiry = new JButton("Balance enquiry");
        balaceenquiry.setBounds(350,485,150,30);
        balaceenquiry.addActionListener(this);
        image.add(balaceenquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(350,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }else if (ae.getSource() == deposit){
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);   
        }else if (ae.getSource() == Fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);    
        } else if(ae.getSource() == pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        } else if(ae.getSource() == balaceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource() == ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    public static  void main(String args[]){
        new Transactions("");
    }
}
