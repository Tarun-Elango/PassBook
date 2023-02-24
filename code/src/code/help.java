package code;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;


public class help  implements ActionListener {
    private static JButton done;
    private static JFrame frame;

    private enum Actions {
    DONE
    }
   
    public help(){
       frame = new JFrame("Help");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(500,230);
         JPanel panel;
         panel = new JPanel();
       
       JLabel label= new JLabel("First Time users: enter your name, computer pin and press setup");
       label.setBounds(10, 20, 80,25);
       panel.add(label);
       JLabel label2= new JLabel("application stores the user, this step is not needed again for the same user.");
       label2.setBounds(10, 50, 80,25);
       panel.add(label2);
   
       JLabel label3= new JLabel("Returning users: type their name, computer pin and press login");
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
