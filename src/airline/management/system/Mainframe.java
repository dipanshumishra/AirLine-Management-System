/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Mainframe extends JFrame{

    public static void main(String[] args){
       new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
    super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
    initialize();
    }
    
    private void initialize(){
      
        setForeground(Color.CYAN);  //it sets text color
        setLayout(null);

        
        //background image codding start
        JLabel newLabel = new JLabel("");
        newLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/backgroundimg.png")));
        newLabel.setBounds(0,0,1900,990);  // (x,y,length,breadth)
        add(newLabel);
        //background image codding end

        
        //heading codding start
        JLabel AirlineManagementSystem = new JLabel("Air India Welcomes You");
        AirlineManagementSystem.setForeground(Color.RED);
        AirlineManagementSystem.setFont(new Font("Tahoma",Font.PLAIN,36));
        AirlineManagementSystem.setBounds(600,60,1000,55);
        newLabel.add(AirlineManagementSystem);
        //heading codding end

        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);

 
         JMenu  AirlineSystem = new JMenu("Airline System");
         AirlineSystem.setForeground(Color.BLUE);
         menubar.add(AirlineSystem);
         
        
         JMenuItem FlightDetails = new JMenuItem("FLIGHT INFO");
         AirlineSystem.add(FlightDetails);
        
         JMenuItem ReservationDetails = new JMenuItem("ADD CUSTOMER DETAILS");
         AirlineSystem.add(ReservationDetails);
         
         JMenuItem PassengerDetails = new JMenuItem("JOURNEY DETAILS");
         AirlineSystem.add(PassengerDetails);
         
         JMenuItem SectorDetails = new JMenuItem("PAYMENT  DETAILS");
         AirlineSystem.add(SectorDetails);
         
         JMenuItem Cancelation = new JMenuItem("CANCELLATION");
         AirlineSystem.add(Cancelation);
         
         
         
         JMenu  List = new JMenu("LIST");
         List.setForeground(Color.BLUE);
         menubar.add(List);
         
         
         JMenu  Misc = new JMenu("MISC");
         Misc.setForeground(Color.BLUE);
         menubar.add(Misc);
         
         
         FlightDetails.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Flight_Info();
            }
         });
         
         
         ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
           
            try{
                new Reservation_System();
               }
            catch(Exception e){e.printStackTrace();}
            }
     
          });
         
         
         PassengerDetails.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                try
                   {
                     new Passenger_Details();
                   }
                catch(Exception e)
                {
                 e.printStackTrace();
                }
                }
         });
           

        SectorDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            
                try
                   {
                    new Sector_Details();
                   }
                catch(Exception e)
                {
                  e.printStackTrace();
                }
            }
        });

       Cancelation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
              try
                 {
                    new Cancelation();
                  }
              catch(Exception e)
              {
                e.printStackTrace();
              }
            }
        });
      
         
       
       setSize(1950,1090);
       setVisible(true);
    }
}
