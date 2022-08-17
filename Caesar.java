public class Caesar extends Cipher {
  protected int shift;
  
  public Caesar(){ //contructor that shifts the letters 3 places 
    shift = 3;
    }
    
  public Caesar(int n){ //constructor that shifts the the letters n places
    shift = n;
    }  
    
  public String encode(String word) {
    StringBuffer result = new StringBuffer();  // Initialize a string buffer
    for (int k = 0; k < word.length(); k++) {  // For each character in word
      char ch = word.charAt(k);                // Get the character
      ch = (char)('a' + (ch - 'a' + shift) % 26);  // Perform Caesar shift
      result.append(ch);                       // Append it to the new string
    }
    return result.toString();                  // Return the result as a string
  } // encode()

  public String decode(String word) {
    StringBuffer result = new StringBuffer();  // Initialize a string buffer
    for (int k = 0; k < word.length(); k++) {  // For each character in word
      char ch = word.charAt(k);                // Get the character
      ch = (char)('a' + (ch - 'a' + (26-shift)) % 26); // Perform reverse shift
      result.append(ch);                       // Append it to the new string
    } 
    return result.toString();                  // Return the result as a string
  } // decode()

} // Caesar
