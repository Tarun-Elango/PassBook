package code;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;


public class helpFrame  implements ActionListener {
    private static JButton done;
    private static JFrame frame;

    private enum Actions {
    DONE
    }
   
    public helpFrame(){
       frame = new JFrame("Help");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(700,230);
         JPanel panel;
         panel = new JPanel();
       
       JLabel label= new JLabel("TO Store password: press store password and enter website/email and its password and hit enter");
       label.setBounds(10, 20, 80,25);
       panel.add(label);
       JLabel label2= new JLabel("To create password: this creates a unique random password, which can then be save to its website if needed");
       label2.setBounds(10, 50, 80,25);
       panel.add(label2);
   
       JLabel label3= new JLabel("To view password: this then prompts you to enter the website after which that password will be shown");
       label3.setBounds(10, 50, 80,25);
       panel.add(label3);

      

       done = new JButton("done");
        done.setBounds(10, 80, 150, 25);
        done.setActionCommand(Actions.DONE.name());
        done.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e)
          {
            frame.dispose();
          }});
       panel.add(done);
       
       frame.add(panel);
       frame.setVisible(true);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      
    }

   
}