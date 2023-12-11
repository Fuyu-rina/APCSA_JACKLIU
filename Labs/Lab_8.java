import java.util.*;
import java.lang.*;

class lab_8 {
  
  static Scanner s = new Scanner(System.in);
  
  public static void main(String[] args) {
        
    System.out.println("Would you like to (E)ncrypt or (D)ecrypt a message?");
  	boolean doEncrypt = getEorD().equals("E");
    
    System.out.println("Enter your shift value: ");
    int shift = getShift();
    
    System.out.println("Enter your message: ");
    String message = s.nextLine();
    
    System.out.printf("Your %s message is: %n%s%n", 
                      doEncrypt ? "encrypted" : "decrypted", 
                      shiftMessage(message, shift, doEncrypt));
                      
  }
  
  public static String shiftMessage(String message, int shift, boolean doEncrypt) {
    StringBuilder sb = new StringBuilder();
    // StringBuilder is a tool that helps build a more custom string. 


    // This method takes the <message> parameter you input and shifts it according to the <shift> parameter. 

    // If the program is meant to encrypt, then <doEncrypt> is true, 
    //   and you should shift every letter in <message> FORWARDS <shift> letters.

    // If the program is meant to decrypt, then <doEncrypt> is false, 
    //   and you should shift every letter in <message> BACKWARDS <shift> letters. 
    
    
    return sb.toString();
  }
  
  public static int getShift() {
    // Data validation: 
    //   this method should return an integer between -25 and 25, inclusive. 
    return 0;
  }
  
  
  public static String getEorD() {
    // Data Validation:
    // this method should return either "E" or "D". 
    // The main method asks whether they want to (e)ncrypt or (d)ecrypt, 
    //   and this method validates that they input either "E" or "D" properly. 
    // You should accept either uppercase or lowercase e/d, 
    //   but they should enter only one letter, otherwise have them input again. 
    return "";
  }
}

