
/**
 * KeywordSubstitution class for keyword substitution ciphers .
 *
 * @author Yves Semana Gisubizo
 * @version 1.0
 */
public class KeywordSubstitution extends Cipher{
    protected static String alphabet;
    
    public KeywordSubstitution(){
        this("", 0);
    }
    public KeywordSubstitution(String keyword, int n){
        alphabet = Alphabet.keywordAlphabet(keyword,n);
    }
    
     public String encode(String word) {
     StringBuffer result = new StringBuffer();  // Initialize a string buffer
     for (int k = 0; k < word.length(); k++) {  // For each character in word
      char ch = word.charAt(k);                // Get the character
      if(ch == ' ')
        result.append(ch);
      else{
        int i = ch - 'a';                    //reducing the index to the next lower index 
        result.append(alphabet.charAt(i));       
      }// Append it to the new string
     }
     return result.toString();                  // Return the result as a string
   } // encode()

   public String decode(String word) {
    StringBuffer result = new StringBuffer();  // Initialize a string buffer
    
    for (int k = 0; k < word.length(); k++) {  // For each character in word
      char ch = word.charAt(k);                // Get the character
      int i = alphabet.indexOf(ch);            //getting the index of the encoded character in the ciphertext
      if (i >= 0)
        result.append((char) (i + 'a'));
      else
        result.append(ch);                       // Append it to the new string
    } 
    return result.toString();                  // Return the result as a string
   } // decode()
}
