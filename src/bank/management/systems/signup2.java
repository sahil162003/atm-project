
package bank.management.systems;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class signup2 extends JFrame implements ActionListener{
    JLabel l2,l3,fname;
   JTextField pan,aadhar;
   JButton next;
   JRadioButton syes,sno,eyes,eno;
   JComboBox religion,category,occupation,education,Income;
   String formno;
    signup2(String formno){
        this.formno = formno;
        
         setLayout(null);
         setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
         
          
        
          l2 = new JLabel(" Page 2 - Additional  Details");  
         l2.setFont(new Font("Railway",Font.BOLD,38));
        l2.setBounds(280,80,570,30);
        add(l2);
        
        
         l3 = new JLabel("Religion:");
        l3.setFont(new Font("Railway",Font.BOLD,30));
        l3.setBounds(100,20,140,300);
        add(l3);
        
        String valReligion[]= {"Hindu","Muslim","sikh","Christian","others"};
         religion = new JComboBox(valReligion);
        religion.setBounds(330,160,420,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        
        
         fname = new JLabel("Category:");
        fname.setFont(new Font("Railway",Font.BOLD,30));
        fname.setBounds(100,70,250,300);
        add(fname);
        
        String valcategory[]= {"General","OBC","SC","ST","others"};
         category = new JComboBox(valcategory);
        category.setBounds(330,210,420,30);
        category.setBackground(Color.WHITE);
        add(category);
        
       
        
        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Railway",Font.BOLD,30));
        dob.setBounds(100,120,250,300);
        add(dob);
        
        String valIncome[]= {"Null","<1,50,000","2,50,000","<5,00,000","upto 10,0000"};
         Income = new JComboBox(valIncome);
        Income.setBounds(330,260,400,30);
        Income.setBackground(Color.WHITE);
        add(Income);
        
                
        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Railway",Font.BOLD,30));
        gender.setBounds(100,190,250,300);
        add(gender);
      
        
    
        JLabel Email = new JLabel("Qualification :");
        Email.setFont(new Font("Railway",Font.BOLD,30));
        Email.setBounds(100,220,250,300);
        add(Email);
        
        
        
        
        
        String educationValues[]= {"Non Graduation","Graduate","post-Graduate","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(330,350,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel martial = new JLabel("Occupation :");
        martial.setFont(new Font("Railway",Font.BOLD,30));
        martial.setBounds(100,270,250,300);
        add(martial);
        
        String OccupationValues[]= {"Salaried","self employed","Bussiness","Student","retired","Others"};
        occupation = new JComboBox(OccupationValues);
        occupation.setBounds(330,410,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
         
        
        JLabel adddress = new JLabel("Pan no:");
        adddress.setFont(new Font("Railway",Font.BOLD,30));
        adddress.setBounds(100,320,250,300);
        add(adddress);
        
            
        pan = new JTextField();
        pan.setFont(new Font("Railway",Font.BOLD,16));
        pan.setBounds(330,460,420,30);
        add(pan);
        
        JLabel city = new JLabel("Adhaar no:");
        city.setFont(new Font("Railway",Font.BOLD,30));
        city.setBounds(100,370,250,300);
        add(city);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Railway",Font.BOLD,16));
        aadhar.setBounds(330,505,420,30);
        add(aadhar);
        
        
        JLabel state = new JLabel("Senior citizen:");
        state.setFont(new Font("Railway",Font.BOLD,30));
        state.setBounds(100,420,250,300);
        add(state);
        
        syes = new JRadioButton("YES");
        syes.setBounds(350,550,80,50);
        syes.setBackground(Color.white);
        add(syes);
        
         sno = new JRadioButton("NO");
        sno.setBounds(440,550,100,50);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);

        
        
        
        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Railway",Font.BOLD,28));
        pincode.setBounds(100,470,400,300);
        add(pincode);
      
        eyes = new JRadioButton("YES");
        eyes.setBounds(350,595,80,50);
        eyes.setBackground(Color.white);
        add(eyes);
        
         eno = new JRadioButton("NO");
        eno.setBounds(440,595,100,50);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup existingGroup = new ButtonGroup();
        existingGroup.add(eyes);
        existingGroup.add(eno);

        
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
    String sreligion = (String)religion.getSelectedItem();
    String scategory = (String) category.getSelectedItem();
    String sincome = (String) Income.getSelectedItem();
    String seducation =(String)education.getSelectedItem();
    String soccupation = (String) occupation.getSelectedItem();

    String seniorcitizen = null; 
    if(syes.isSelected()){
        seniorcitizen = "yes"; 
    }else if (sno.isSelected()){
        seniorcitizen = "NO";
    }
    String existingaccount = null;
    if(eyes.isSelected()){
        existingaccount = "yes"; 
    }else if (eno.isSelected()){
        existingaccount = "NO";
    }
    String span  = pan.getText();
      String saadhar= aadhar.getText();
      
    try{
        
          conn c = new conn();
          String query = "insert into signup2 values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"', '"+saadhar+"', '"+seniorcitizen+"','"+existingaccount+"')";
          c.s.executeUpdate(query);
         setVisible(false);
        new SignupThree(formno).setVisible(true);
         
         
         
      }catch (Exception e){
          System.out.println(e);
      }
     
    }
    public static void main(String args[]){
        new signup2("");
    }
}
