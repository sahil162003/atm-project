package bank.management.systems; 
import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class signupone extends JFrame implements  ActionListener {
    long random; 
   JTextField nametextfield,fnametextfield,emailaddresstextfield,addresstextfield,citytextfield
           ,statetextfield,pincodetextfield;
   JButton next;
   JRadioButton male ,female,other,married,unmarried;
   JDateChooser dateChooser;
   
    signupone(){
        
         setLayout(null);
         Random ran = new Random();
         random = Math.abs((ran.nextLong() % 9000L) + 1000L);
         
         JLabel formno = new JLabel("APPLICATION FORM NO. "+ random);  
         formno.setFont(new Font("Railway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
         JLabel PersonalDetails = new JLabel("Personal Details");  
         PersonalDetails.setFont(new Font("Railway",Font.BOLD,30));
        PersonalDetails.setBounds(290,80,300,30);
        add(PersonalDetails);
        
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Railway",Font.BOLD,30));
        name.setBounds(100,20,100,300);
        add(name);
        
        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Railway",Font.BOLD,16));
        nametextfield.setBounds(330,160,420,30);
        add(nametextfield);
        
        JLabel fname = new JLabel("Father's name:");
        fname.setFont(new Font("Railway",Font.BOLD,30));
        fname.setBounds(100,70,250,300);
        add(fname);
        
        fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("Railway",Font.BOLD,16));
        fnametextfield.setBounds(330,210,420,30);
        add(fnametextfield);
        
        JLabel dob = new JLabel("Date of birth:");
        dob.setFont(new Font("Railway",Font.BOLD,30));
        dob.setBounds(100,120,250,300);
        
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(330,260,400,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Railway",Font.BOLD,30));
        gender.setBounds(100,170,250,300);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(330,310,60,30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("female");
        female.setBounds(440,310,80,30);
        female.setBackground(Color.white);
        add(female);
        
        other = new JRadioButton("other");
        other.setBounds(540,310,80,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JLabel Email = new JLabel("Email Address:");
        Email.setFont(new Font("Railway",Font.BOLD,30));
        Email.setBounds(100,220,250,300);
        add(Email);
        
        emailaddresstextfield = new JTextField();
        emailaddresstextfield.setFont(new Font("Railway",Font.BOLD,16));
        emailaddresstextfield.setBounds(330,360,420,30);
        add(emailaddresstextfield);
        
        JLabel martial = new JLabel("Martial Status:");
        martial.setFont(new Font("Railway",Font.BOLD,30));
        martial.setBounds(100,270,250,300);
        add(martial);
        
         married  = new JRadioButton("Married");
        married.setBounds(330,410,80,30);
        married.setBackground(Color.white);
        add(married);
        
         unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(440,410,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
         
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
       

        
        JLabel adddress = new JLabel("Address:");
        adddress.setFont(new Font("Railway",Font.BOLD,30));
        adddress.setBounds(100,320,250,300);
        add(adddress);
        
            
        addresstextfield = new JTextField();
        addresstextfield.setFont(new Font("Railway",Font.BOLD,16));
        addresstextfield.setBounds(330,460,420,30);
        add(addresstextfield);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Railway",Font.BOLD,30));
        city.setBounds(100,370,250,300);
        add(city);
        
        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Railway",Font.BOLD,16));
        citytextfield.setBounds(330,505,420,30);
        add(citytextfield);
        
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Railway",Font.BOLD,30));
        state.setBounds(100,420,250,300);
        add(state);
        
        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Railway",Font.BOLD,16));
        statetextfield.setBounds(330,555,420,30);
        add(statetextfield);
        
        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Railway",Font.BOLD,30));
        pincode.setBounds(100,470,250,300);
        add(pincode);
        
        pincodetextfield = new JTextField();
        pincodetextfield.setFont(new Font("Railway",Font.BOLD,16));
        pincodetextfield.setBounds(330,610,420,30);
        add(pincodetextfield);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(700,645,60,35);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,100);
        setVisible(true);
        
    }  
    public void actionPerformed(ActionEvent ae){

    String formno =  "" +  random;//long
    String name = nametextfield.getText();
    String fname = fnametextfield.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if (male.isSelected()){
        gender = "Male";
        
    }else if (female.isSelected()){
        gender = "Female";
        
    }else if (other.isSelected()){
        gender = "other";
    }
    String email = emailaddresstextfield.getText();
    String marital = null;
    if (married.isSelected()){
        marital = "Married";
    } else if (unmarried.isSelected()){
        marital = "Unmarried";
    }
    String address  = addresstextfield.getText();
      String city = citytextfield.getText();
      String state = statetextfield.getText();
        String pin = pincodetextfield.getText();
        
        try {
            if (name.equals("")){
             JOptionPane.showMessageDialog(null,"Name is Required");
             
            
            }else if (fname.equals("")){
             JOptionPane.showMessageDialog(null,"Father Name is Required");

            }else if (dob.equals("")){
             JOptionPane.showMessageDialog(null," date is Required");

            }else if (email.equals("")){
             JOptionPane.showMessageDialog(null,"Email  is Required");

            }else if (address.equals("")){
             JOptionPane.showMessageDialog(null,"address is Required");

            }else if (dob.equals("")){
             JOptionPane.showMessageDialog(null," date is Required");

            }else if (city.equals("")){
             JOptionPane.showMessageDialog(null," city is Required");

            }else if (state.equals("")){
             JOptionPane.showMessageDialog(null," state is Required");

            }else if (pin.equals("")){
             JOptionPane.showMessageDialog(null,"Pincode is Required");

            }
            
            else {
                conn c = new conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"', '"+city+"', '"+pin+"','"+state+"')";
                       c.s.executeUpdate(query);
                       
                       setVisible(false);
                       new signup2(formno).setVisible(true);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new signupone();
    }
}
