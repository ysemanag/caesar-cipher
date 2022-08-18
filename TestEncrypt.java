/**
 * Class for testing the encryption process
 *
 * @author Yves Semana Gisubizo
 * @version 1.0
 */

import java.util.*;

public class TestEncrypt {

  public static void main(String args[]) {
    
    Cipher cipher = new Caesar(); //implementing shift as 3 places
   
    String plain = "this is the secret message";  // Here’s the message
    String secret = cipher.encrypt(plain);        // Encrypt the message with 3 places shift
    
    System.out.println(" ********* Caesar Cipher Encryption 1 ********* ");
    System.out.println("PlainText: " + plain);    // Display the results
    System.out.println("Encrypted: " + secret);
    System.out.println("Decrypted: " + cipher.decrypt(secret)); // Decrypt
    System.out.println();
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a nonnegative integer that controls the shift places"); 
    int N=sc.nextInt(); //taking n shift places from the user
    Cipher cipher1 = new Caesar(N);//invoking the second constructor of Caesar class with n shift places input
    String secret1 = cipher1.encrypt(plain);        // Encrypt the message with N places shift

    System.out.println(" ********* Caesar Cipher Encryption 2 ********* ");
    System.out.println("PlainText: " + plain);    // Display the results
    System.out.println("Encrypted: " + secret1);
    System.out.println("Decrypted: " + cipher1.decrypt(secret1)); // Decrypt
    System.out.println();
    /*
    System.out.println(" ********* Testing the Alphabet Class ********* ");
    System.out.println(" Beginning with the keyword:");
    System.out.println(Alphabet.keywordAlphabet("blue"));
    System.out.println();
    System.out.println(" Keyword at user-specified position:");
    System.out.println("Enter the position value of the keyword: ");
    int n = sc.nextInt();
    System.out.println(Alphabet.keywordAlphabet("blue",n));
    System.out.println();
    */
    System.out.println(" ********* Testing the KeySubstitution Class ********* ");
    KeywordSubstitution K = new KeywordSubstitution("blue",4);
    System.out.println("PlainText: " + KeywordSubstitution.alphabet);    // Display the results
    System.out.println("Encrypted: " + K.encrypt(KeywordSubstitution.alphabet));
    System.out.println("Decrypted: " + K.decrypt(K.encrypt(KeywordSubstitution.alphabet))); // Decrypt
    System.out.println();
  }

}
