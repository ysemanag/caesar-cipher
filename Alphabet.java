
/**
 * Aplhabet class that constructs cipher alphabets for keyword substitution ciphers .
 *
 * @author Yves Semana Gisubizo
 * @version 1.0
 */
public class Alphabet
{
   public static String keywordAlphabet(String keyword){
      return keywordAlphabet(keyword, 0);
    }
   
   public static String keywordAlphabet(String keyword, int n){
       char ch ='a';
       StringBuffer all_alphabets = new StringBuffer();
       for (int i = 0; i < 26 ; i++){ //getting all alphabets in a string
           all_alphabets.append(ch);
           ch++;
        }
        
       char key;
       for (int k = 0; k < keyword.length(); k++){
             key = keyword.charAt(k);
             ch ='a';
             for(int j=0; j<26; j++){
              if (key == ch){ //removing keyword alphabets from all alphabets
                 all_alphabets.replace(j, j+1, " "); //replacing the keyword letters by white spaces, not deleting them so the index stays the same
                }
               ch++;
            }
        }
        String str = all_alphabets.toString().replaceAll("\\s", "");//removing all white spaces from the rest of the alphabets
        int str_len = str.length();
        
       String other_alphabets = str.substring(0,(str_len - (n % str_len))); //putting aside the alphabets corresponding to the size on position n 
       String extra_alphabets = str.substring((str_len - (n % str_len))); //getting alphabets corresponding to size n
       
       return extra_alphabets + keyword + other_alphabets;
    }
}
