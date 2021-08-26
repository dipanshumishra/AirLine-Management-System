/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.management.system;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class conn {
   
    Connection c;
    Statement s;

    public conn()
    {
      
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             c= DriverManager.getConnection("jdbc:mysql://localhost:3306/project4","root","");
             s=c.createStatement();
           }
         catch(Exception e)
         {
            System.out.print(e);
         }
    }
}    
