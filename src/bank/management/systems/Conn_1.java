package bank.management.systems;
import java.sql.*;
public class Conn_1 {
    Connection c;
    Statement s;
    public Conn_1(){
 
        try{
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=CONVERT_TO_NULL","admin","1234");
            s = c.createStatement();
            
        }catch (Exception e){
            System.out.println(e);
        }
    
    }
}
