package code;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

//import sun.security.util.IOUtils;

import java.util.Enumeration;
//import java.io.FileReader; 
// Import the File class
// Import the IOException class to handle errors
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import java.util.Scanner; 

public class storage {
    static String userName;
    static String password;
   

public storage(){

}
   

  //  static HashMap<String, String> map = new HashMap<>();
   
   
   public void loginStorage(String userName, String password){
	
    	 try {
    		 Writer output;
    		 output = new BufferedWriter(new FileWriter("C:\\Users\\Tarun Elango\\Desktop\\Test\\code\\src\\code\\storage.txt", true));
    		 
    		 output.append(userName+"\n"+password+"\n");
    		 output.close();
    	
	
    	    
    	      System.out.println("Successfully wrote to the file.");
    	    } catch (IOException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
        
      // map.put(userName, password);
      

    }
 	
    public boolean searchStorage(String userName, String password) throws Exception{
      
  
    	boolean x = false;
      try {
    	
  
    	  
    	  File myObj = new File("C:\\Users\\Tarun Elango\\Desktop\\Test\\code\\src\\code\\storage.txt");
          Scanner myReader = new Scanner(myObj);
          
 	     while (myReader.hasNextLine()) {
 	    	
 	         String data = myReader.nextLine();

 	         if(data.equals(userName)) {
 	        	 String test= myReader.nextLine();
 	        	 
 	        	 
	        	  TrippleDes des = new TrippleDes();
	        	  String test1= des.decrypt(test);
	        	  if(test1.equals(password)) {
 	        	 
 	        	 x=  true;}
 	        }
 	        //myReader.close();
 	      }
 	    
 	    } catch (IOException e) {
 	      System.out.println("An error occurred.");
 	      e.printStackTrace();
 	    }

      return x;
   
    }

 
    
    
String passwordstore;
String websiteStore;

static Hashtable<String, String> ht1 = new Hashtable<>();
    public void passwordstorage(   String websiteStore ,String passwordstore  ){
    	
    	 try {
    		 Writer output;
    		 output = new BufferedWriter(new FileWriter("C:\\Users\\Tarun Elango\\Desktop\\Test\\code\\src\\code\\pass.txt", true));
    		 
    		 output.append(websiteStore+"\n"+passwordstore+"\n");
    		 output.close();
    	
    		    System.out.println("Successfully wrote to the file.");
 	    } catch (IOException e) {
 	      System.out.println("An error occurred.");
 	      e.printStackTrace();
 	    }
     
    	
    	
    	
    	


    }

	 
	
    
    String passwordstore1;
    String websiteStore1;

 
        public void passwordstorage1(   String websiteStore1 ,String passwordstore1  ){
        	
        	 try {
        		 Writer output;
        		 output = new BufferedWriter(new FileWriter("C:\\Users\\Tarun Elango\\Desktop\\Test\\code\\src\\code\\pass.txt", true));
        		 
        		 output.append(websiteStore1+"\n"+websiteStore1+"\n"+passwordstore1+"\n");
        		 output.close();
        	
        		    System.out.println("Successfully wrote to the file.");
     	    } catch (IOException e) {
     	      System.out.println("An error occurred.");
     	      e.printStackTrace();
     	    }
         
        	
        	
        	
        	


        }   
    
	
	 String output=null;
    public String searchpasswordStoreage(String websiteStore) throws Exception{
         
            	String y= null;
    	  String decrypted= null;
      try {
        	  File myObj = new File("C:\\Users\\Tarun Elango\\Desktop\\Test\\code\\src\\code\\pass.txt");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
        	  
        	  
   	    	
   	         String data = myReader.nextLine();
  
   	         if(data.equals(websiteStore)) {
   	        	 String point = myReader.nextLine();
   	        	 if(point.equals(websiteStore)) {
   	        		 y= myReader.nextLine();
   	   	        	 
   	        	 }
   	        	 else {
   	        	// decrypted = myReader.nextLine();
   	        	 
   	        	  TrippleDes des = new TrippleDes();
   	        	 y= des.decrypt(point);
   	        }}
     
  	         
        	  
          }
          
 
 	    } catch (IOException e) {
 	      System.out.println("An error occurred.");
 	      e.printStackTrace();
 	    }
    	
    	
    	
    	
    
			//    System.out.println(ht1.get(websiteStore));
            return y;
    }

    String leftvalue;
    public boolean deletestorage(String leftvalue) {
    	boolean x= false;
        try {
      	  File myObj = new File("C:\\Users\\Tarun Elango\\Desktop\\Test\\code\\src\\code\\pass.txt");
//      	FileReader fr = new FileReader(myObj);
        Scanner myReader = new Scanner(myObj);
        
        while (myReader.hasNextLine()) {
        	String webname= myReader.nextLine();
        	
        	if(webname.equals(leftvalue)) {
           		String star= myReader.nextLine();
        	
        	
        		//String next	=null;
        	if(star.equals(webname)) {
   //System.out.println(star);
       			String next = myReader.nextLine();
       		 //  System.out.println(next);
        		
        		delete(webname);
                delete(star);
                delete(next);
                x= true;

        		}else {
        	     			
        			 delete(webname);
        			delete(star);
    			x= true;
        		
        		} 

        		
        		 }
        		 
        	}
        	
        	
        
        
      
        }
        catch (IOException e) {
   	      System.out.println("An error occurred.");
   	      e.printStackTrace();
   	    }
      	
        
    
		return x;
		
		
		
    	
   
    }
    
public void delete(String x) throws IOException {
	Path path = Paths.get("C:\\Users\\Tarun Elango\\Desktop\\Test\\code\\src\\code\\pass.txt");
	Charset charset = StandardCharsets.UTF_8;
	String content = new String(Files.readAllBytes(path), charset);
	content = content.replaceAll(x, "");
	Files.write(path, content.getBytes(charset));

	

	
	
}

}
    


   
