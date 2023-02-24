package code;
import java.security.SecureRandom;

public class passcreator {
    static char[] SYMBOLS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static char[] NUMBERS = "0123456789".toCharArray();
    static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    SecureRandom random = new SecureRandom();

//    public String createPassword(int length){
//        assert length >= 4;
//        char[] password = new char[length];
//        
//        
//        //get the requirements out of the way
//        password[0] = LOWERCASE[random.nextInt(LOWERCASE.length)];
//        password[1] = UPPERCASE[random.nextInt(UPPERCASE.length)];
//        password[2] = NUMBERS[random.nextInt(NUMBERS.length)];
//        password[3] = SYMBOLS[random.nextInt(SYMBOLS.length)];
//
//        //populate rest of the password with random chars
//        for (int i = 4; i < length; i++) {
//            password[i] = ALL_CHARS[random.nextInt(ALL_CHARS.length)];
//        }
//
//        //shuffle it up
//        for (int i = 0; i < password.length; i++) {
//            int randomPosition = random.nextInt(password.length);
//            char temp = password[i];
//            password[i] = password[randomPosition];
//            password[randomPosition] = temp;
//        }
//
//        return new String(password);
//
//    }
    
    
    public static String createPassword(int len)
    {
        // ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }


    

}
