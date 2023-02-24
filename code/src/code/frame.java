package code;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
public class frame extends JFrame implements ActionListener{
    private enum Actions {
        STORE,CREATE,VIEW, HELP, BACK, DELETE
      }
    
private JButton button1;
private JButton button2;
private JButton button3;
private JButton button4;
//private JLabel label;
private JPanel panel;
private JTextArea text;
private JMenuBar menubar;
private JMenu menu1;
private JMenu menu2;
private JMenu menu3;
private JMenu menu4;
  static login log = new login();
  static String loginName = log.getname();
public frame(){
        super("PassBook"+" " +loginName);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(500,230);
         setVisible(true);
         setLayout(new BorderLayout());

         panel = new JPanel();
         //label = new JLabel("                           select an option");
         button1= new JButton("Store Password");
         button1.setPreferredSize(new Dimension(167, 200));
         button1.setActionCommand(Actions.STORE.name());
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
              new storePassFrame();
            }});


         button2= new JButton("Create Password");
         button2.setPreferredSize(new Dimension(167, 200));
         button2.setActionCommand(Actions.CREATE.name());
         button2.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
             {
               new createPassFrame();
             }});
 



         button3= new JButton("View Password");
         button3.setPreferredSize(new Dimension(167, 200));
         button3.setActionCommand(Actions.VIEW.name());
         button3.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e)
             {
               new viewPassFrame();
             }});
 
      

         menubar = new JMenuBar();



          menu1 = new JMenu("Help");
         
           menu1.addActionListener(new MenuActionListener2() );
           menubar.add(menu1);
           JMenuItem newMenuItem2 = new JMenuItem("show help");
           newMenuItem2.addActionListener(new MenuActionListener2());
           menu1.add(newMenuItem2);
         


          menu3= new JMenu("Back");
          menu3.addActionListener(new MenuActionListener() );
            menubar.add(menu3);
            JMenuItem newMenuItem = new JMenuItem("go back");
    newMenuItem.addActionListener(new MenuActionListener());
    menu3.add(newMenuItem);
    
    
    menu4= new JMenu("Delete");
    menu4.addActionListener(new MenuActionListener() );
      menubar.add(menu4);
      JMenuItem newMenuItem4 = new JMenuItem("delete password");
newMenuItem4.addActionListener(new MenuActionListener3());
menu4.add(newMenuItem4);
       
         panel.add(button1);
         panel.add(button2);
         panel.add(button3);
        

         //add(label, BorderLayout.PAGE_START);
         add(button1, BorderLayout.LINE_START);
         add(button2, BorderLayout.CENTER);
         add(button3, BorderLayout.LINE_END);
         add(menubar, BorderLayout.PAGE_START);
   

      
}



@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
}
class MenuActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
     // System.out.println("Selected: ");
    dispose();
    }
  }

  class MenuActionListener2 implements ActionListener {
    public void actionPerformed(ActionEvent e) {
     
   new helpFrame();

    }
  }
  
  
  class MenuActionListener3 implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	     
	   new deleteframe();

	    }
	  }
  
}
