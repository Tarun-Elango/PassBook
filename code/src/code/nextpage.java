package code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class nextpage {
    private enum Actions {
        STORE, DONE
      }

    private static    JFrame frame;
    private static JTextField emailText;
    private static JLabel print;
    public nextpage(){
        frame = new JFrame("Store");
        
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
        emailText = new JTextField();
         emailText.setBounds(200, 20, 165, 25);
          panel.add(emailText);

          JLabel passlabel;
          passlabel= new JLabel("enter desired password size");
         passlabel.setBounds(10, 50,180,25);
          panel.add(passlabel);
   
          JTextField userText;
          userText = new JTextField();
          userText.setBounds( 200, 50, 165, 25);
           panel.add(userText);
          

           print = new JLabel("");
          print.setBounds(10,170,300,25);
          panel.add(print); 


          JButton button1;
          button1= new JButton("Store");
          button1.setBounds(10, 90, 80, 25);;
         button1.setActionCommand(Actions.STORE.name());
          button1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              {
                  String name = emailText.getText();
                  int x=Integer.parseInt(userText.getText()) ;
                  
                 passcreator passcreate  = new passcreator();
               storage store = new storage();
            String passcode= passcreate.createPassword(x);
               
               store.passwordstorage1(name,passcode);
              print.setText("password and website/email have been stored");
              }});

             panel.add(button1);

          JButton button2;
          button2= new JButton("Done");
          button2.setBounds(10, 130, 80, 25);;
         button2.setActionCommand(Actions.DONE.name());
          button2.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e)
              {
                  frame.dispose();
              }});




             panel.add(button2);
             frame.add(panel);
             frame.setVisible(true);

    }
}
