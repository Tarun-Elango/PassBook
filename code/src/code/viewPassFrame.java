package code;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.swing.*;
public class viewPassFrame extends JFrame{

    private enum Actions {
    SHOW, DONE
      }
      private static JTextField userText;
      private static JPasswordField passText;
    private static    JFrame frame;
    public viewPassFrame(){

        frame = new JFrame("view password");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,230);
         frame.setVisible(true);
         frame.setLayout(new BorderLayout());
         JPanel panel;
          panel = new JPanel();
       panel.setLayout(null);

       JLabel website;
          website= new JLabel("Website/Email");
         
          website.setBounds(10, 20,110,25);
          panel.add(website);

        userText = new JTextField();
         userText.setBounds(170, 20, 165, 25);
          panel.add(userText);

          JLabel passlabel;
          passlabel= new JLabel("passsword");
         passlabel.setBounds(10, 50,110,25);
          panel.add(passlabel);

          
          JLabel print;
          print = new JLabel("");
          print.setBounds(170, 50, 165, 25);
          panel.add(print); 
        

          JButton button1;
          button1= new JButton("SHOW");
          button1.setBounds(10, 90, 80, 25);;
         button1.setActionCommand(Actions.SHOW.name());
          button1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              {
              String name = userText.getText();
          
                storage store = new storage();
                
                
                
	        	  try {
					print.setText( store.searchpasswordStoreage(name));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
              }});

             panel.add(button1);



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


       
       frame.add(panel);
       frame.setVisible(true);


    }
    
}
