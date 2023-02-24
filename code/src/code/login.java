package code;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class login  implements ActionListener{
  
   private  static String name;
   public String getname(){
     return name;
   }
    private static JMenuBar menubar;
    private static JMenu menu1;
   private static    JFrame frame;
       private static JLabel passlabel;
    private static JTextField userText;
    private static JPasswordField passText;
    private static JButton button;
    private static JButton setup;
    private static JButton help;
    private static JLabel print;
    boolean check= false;
    static Integer key=6;
    private enum Actions {
        BUTTON,
        SETUP,HELP
      }
    
    public static void main(String[] args){
        //super();
      
        frame = new JFrame("PassBook - Login page");
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,230);
        frame.setLayout(new BorderLayout());

         JPanel panel;
          panel = new JPanel();


            
         
         panel.setLayout(null);
         JLabel label;
       label= new JLabel("Name");
         label.setBounds(10, 20,80,25);
         panel.add(label);
       userText = new JTextField();
         userText.setBounds(170, 20, 165, 25);
         panel.add(userText);

      passlabel= new JLabel("Computer PIN");
         passlabel.setBounds(10, 50,110,25);
         panel.add(passlabel);
          passText = new JPasswordField();
         passText.setBounds(170, 50, 165, 25);
         panel.add(passText);

         frame.add(panel);

        button = new JButton("Unlock");
         button.setBounds(10, 80, 80, 25);
         button.setActionCommand(Actions.BUTTON.name());
        button.addActionListener(new login());
        panel.add(button);

       setup = new JButton("Set Up");
         setup.setBounds(10, 110, 80, 25);
         setup.setActionCommand(Actions.SETUP.name());
        setup.addActionListener(new login());
        panel.add(setup);

        help = new JButton("Help");
        help.setBounds(10, 142, 80, 25);
        help.setActionCommand(Actions.HELP.name());
    help.addActionListener(new login());
       panel.add(help);


         print = new JLabel("");
        print.setBounds(10,170,300,25);
        panel.add(print); 

         frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       // this code is perfomed when click the button
        
       storage storage = new storage(); 
       
      

        if(e.getActionCommand()== Actions.SETUP.name()){
        
          name = userText.getText();
          String pin = passText.getText();
          TrippleDes des = null;
          try {
			 des = new TrippleDes();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
         
          storage.loginStorage(name, des.encrypt(pin));
    	  
      
       
        print.setText("user has been set");
          userText.setText("");
          passText.setText("");
                   }


     if(e.getActionCommand()== Actions.BUTTON.name()){
    
       
         name = userText.getText();
          String pin = passText.getText();
      

     try {
		if(storage.searchStorage(name, pin)){
		  new frame();
		
		 }

		  


		    else{
		        print.setText("retry");
		            
		    }
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      }
     
      else if(e.getActionCommand()== Actions.HELP.name()){
       new help();
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
    }


    
    
}

