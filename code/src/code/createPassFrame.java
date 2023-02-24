package code;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
public class createPassFrame extends JFrame{
    private enum Actions {
        STORE,CREATE, DONE
      }
          private static JTextField userText;
    private static JPasswordField passText;
    private static    JFrame frame;
    //private static int x;
    


    public createPassFrame(){
        frame = new JFrame("create password");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,230);
         frame.setVisible(true);
         frame.setLayout(new BorderLayout());
         JPanel panel;
          panel = new JPanel();
       panel.setLayout(null);


       JLabel print;
       print = new JLabel("");
       print.setBounds(170, 80, 165, 25);
       panel.add(print); 
    
       JLabel passlabel;
       passlabel= new JLabel("enter desired size");
      passlabel.setBounds(10, 20,110,25);
       panel.add(passlabel);

       JTextField userText;
       userText = new JTextField();
       userText.setBounds( 150, 20, 165, 25);
        panel.add(userText);
       
      
       

       JButton button2;
       button2= new JButton("create");
       button2.setBounds(150, 50, 165, 25);;
      button2.setActionCommand(Actions.CREATE.name());
       button2.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e)
           {
              passcreator passcreate  = new passcreator();
               //passcreate.createPassword(8);
               int x=Integer.parseInt(userText.getText()) ;
              print.setText(passcreate.createPassword(x));
           }});

          panel.add(button2);


          JButton button3;
          button3= new JButton("Done");
          button3.setBounds(10, 130, 80, 25);;
         button3.setActionCommand(Actions.DONE.name());
          button3.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              {
                  frame.dispose();
              }});

             panel.add(button3);

             JButton button1;
          button1= new JButton("Store");
          button1.setBounds(150, 110, 165, 25);;
         button1.setActionCommand(Actions.STORE.name());
          button1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              {
            
                 new nextpage();
              
              }});

             panel.add(button1);




            



          frame.add(panel);
          frame.setVisible(true);



    }
   
    
}


