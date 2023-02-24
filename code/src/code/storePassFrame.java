package code;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.swing.*;
public class storePassFrame  extends JFrame{
    private enum Actions {
        STORE, DONE
      }
    private static    JFrame frame;
  //  private JButton button1;
    private JButton button2;
  
    private static JTextField userText;
    private static JPasswordField passText;
   
    public storePassFrame(){
       frame = new JFrame("Store password");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,230);
         frame.setVisible(true);
         frame.setLayout(new BorderLayout());
         JPanel panel;
          panel = new JPanel();
       panel.setLayout(null);

       JLabel print;
       print = new JLabel("");
       print.setBounds(10,170,300,25);
       panel.add(print); 
       
       JLabel print2;
       print2 = new JLabel("");
       print2.setBounds(10,150,300,25);
       print2.setText("tip: have different passwords for different accounts");
       panel.add(print2); 


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
           passText = new JPasswordField();
         passText.setBounds(170, 50, 165, 25);
         panel.add(passText);

          frame.add(panel);

          JButton button1;
          button1= new JButton("Store");
          button1.setBounds(10, 90, 80, 25);;
         button1.setActionCommand(Actions.STORE.name());
          button1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              { byte[] pincode = null;
                  String name = userText.getText();
                  String pin = passText.getText();
               
               storage store = new storage();
              
               TrippleDes des = null;
			try {
				des = new TrippleDes();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        	 
             
               store.passwordstorage(name,  des.encrypt(pin));
               print.setText("password and website/email have been stored");
              }});

             panel.add(button1);

             JButton button2;
             button2= new JButton("Done");
             button2.setBounds(10, 125, 80, 25);;
            button2.setActionCommand(Actions.DONE.name());
             button2.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent e)
                 {
                     frame.dispose();
                 }});
   
                panel.add(button2);

         

          frame.setVisible(true);


    }
    
}
