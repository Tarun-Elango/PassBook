package code;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//import nextpage.Actions;

public class deleteframe {
	 private static    JFrame frame;
	 private enum Actions {
	       DELETE, DONE
	      }
	 
	 private static JTextField emailText;
	    private static JLabel print;
	public deleteframe() {
		 frame = new JFrame("Store");
	        
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.setSize(500,230);
	         frame.setVisible(true);
	         frame.setLayout(new BorderLayout());
	         JPanel panel;
	          panel = new JPanel();
	       panel.setLayout(null);
	       
	       print = new JLabel("");
	          print.setBounds(10,170,300,25);
	          panel.add(print); 
	          


	       JLabel website;
	          website= new JLabel("Website/Email");
	         
	          website.setBounds(10, 20,110,25);
	          panel.add(website);
	        emailText = new JTextField();
	         emailText.setBounds(200, 20, 165, 25);
	          panel.add(emailText);
	          
	          storage st = new storage();
	          JButton button1;
	          button1= new JButton("delete");
	          button1.setBounds(10, 90, 80, 25);;
	         button1.setActionCommand(Actions.DELETE.name());
	          button1.addActionListener(new ActionListener() {
	              public void actionPerformed(ActionEvent e)
	              {
	                  String name = emailText.getText();
	               
	          
	             if(     st.deletestorage(name)) {
	              print.setText("password and website/email have been deleted");
	                }
	             else{
	                   print.setText("password and website/email not found");
	              }	              
	              
	              
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
