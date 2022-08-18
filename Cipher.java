/**
 * Abstract class Cipher that is inherited by the Caesar class
 *
 * @author Yves Semana Gisubizo
 * @version 1.0
 */

import java.util.*;

public abstract class Cipher {

  public String encrypt(String s) {
    StringBuffer result = new StringBuffer ("");      // Use a StringBuffer
    StringTokenizer words = new StringTokenizer(s);   // Break s into its words
    while (words.hasMoreTokens()) {                   // For each word in s
      result.append(encode(words.nextToken()) + " "); // Encode it
    }
    return result.toString();                         // Return the result
  } // encrypt()

  public String decrypt(String s) {
    StringBuffer result = new StringBuffer("");       // Use a String Buffer
    StringTokenizer words = new StringTokenizer(s);   // Break s into words
    while (words.hasMoreTokens()) {                   // For each word in s
      result.append(decode(words.nextToken()) + " "); // Decode it
    }
    return result.toString();                         // Return the decryption
  } // decrypt()

  public abstract String encode(String word);         // Abstract methods
  
  public abstract String decode(String word);

} // Cipher
