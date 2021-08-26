/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class Login extends  Frame implements ActionListener{

    
       public static void main(String[] args)
         {
           new Login();
         } 
    TextField t1,t2;
    Label l1,l2;
    Button b2,b3,b4;
    GridBagLayout gb1;
    GridBagConstraints gbc;
    Font f1,f2;
    
     public Login(){
         
         super("Login");               //heading of the frame
         setBackground(Color.CYAN);    //frame background color
         f1 = new Font("TimesRoman",Font.BOLD,20);  // text font 1
         f2 = new Font("TimesRoman",Font.BOLD,15);    //text font 2,texture-BOLD,size-15
         
         gb1 = new GridBagLayout();   //pre defined layout //set layout(null); // set bounds (x,y,length,breadth);
         gbc= new GridBagConstraints();
         setLayout(gb1);    //setLayout(new FlowLayout);
     
         l1 = new Label("Username");
         l1.setFont(f1);
         l2 = new Label("Password");
         l2.setFont(f1);
         
         t1 = new TextField(15);   //size(15)
         t2 = new TextField(15);   //or Jpassword p = new JPasswordField(); and dont write the next echo line
         t2.setEchoChar('*');
         
         b2 = new Button("Reset");
         b2.setFont(f2);
         b3 = new Button("Submit");
         b3.setFont(f2);
         b4 = new Button("Close");
         b4.setFont(f2);
         
         gbc.gridx=0;
         gbc.gridy=0;
         gb1.setConstraints(l1,gbc);   //label first - Username
         add(l1);
         
         gbc.gridx=2;
         gbc.gridy=0;
         gb1.setConstraints(t1, gbc);   //Text-Filed Username
         add(t1);
         
         gbc.gridx=0;
         gbc.gridy=2;
         gb1.setConstraints(l2,gbc);   //Label Second - Password
         add(l2);

         gbc.gridx=2;
         gbc.gridy=2;
         gb1.setConstraints(t2, gbc);   //Text-Field 2 - Password
         add(t2);
         
         
         gbc.gridx=0;
         gbc.gridy=8;
         gb1.setConstraints(b2,gbc);   // Button-Field 1- Reset
         add(b2);
         
         gbc.gridx=2;
         gbc.gridy=8;
         gb1.setConstraints(b3,gbc);   //Button-Field 2- Submit
         add(b3);
         
         gbc.gridx=4;
         gbc.gridy=8;
         gb1.setConstraints(b4,gbc);   //Button-Field 3- Close
         add(b4);
         
         b2.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
     
       setVisible(true);  //by default it is false so make it true
       setSize(600,500);      //frame size 
       setLocation(400,200);
     }    
   
       public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==b2)
         {
          t1.setText("");   //sets text to null
          t2.setText("");    //sets text to null
         }
       
       if(ae.getSource()==b4)
         {
          System.exit(0);    //project close or terminates project
         }
       if(ae.getSource()==b3)
          {
          try
          {
              conn c1= new conn();
             
              String s1 = t1.getText();
              String s2 = t2.getText();
             
                String str = "select * from login where username ='"+s1+"' and password = '"+s2+"'   ";
                ResultSet rs = c1.s.executeQuery(str);    
                //note if we have used select keyword in the query then use executeQuery and if have used insert or other than use executeUpdate
                  if(rs.next())
                     {
                        new Mainframe();
                        setVisible(false);
                     }
                  else 
                  {
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                    setVisible(false);  //hide
                  }
          }
             catch(Exception e){}
          }
       }
}
