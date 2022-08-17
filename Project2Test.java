import java.util.*;
/**
 * Project2Test Java Application class for testing my other classes .
 *
 * @author Yves Semana Gisubizo
 * @version 1.0
 */
public class Project2Test
{
  public static void main(String []args){
     boolean quit = false;// to control the quitting of the switch, only when exit is selected
   do{
       Scanner sc = new Scanner(System.in);  
       System.out.println("Select one of the following options.\n1. Encryption\n2. Decription\n3. Exit");
       System.out.print("Enter your choice: ");
       int ch = sc.nextInt();
       System.out.println();
    
    switch(ch){
       case 1:
         System.out.println("Now, select an encryption method from the following.\na. Caesar cipher\nb. Keyword substitution cipher");
         System.out.print("Enter your choice: ");
         char ch1 = sc.next().charAt(0);
         sc.nextLine();
         System.out.println();
         switch(ch1){
            case 'a':
               System.out.print("Enter a nonnegative number of places to shift: "); 
               int N = sc.nextInt(); //taking n shift places from the user
               System.out.println();
               System.out.print("Enter a plaintext message: "); 
               sc.nextLine();
               String plain = sc.nextLine();
               System.out.println();
               Cipher cipher1 = new Caesar(N);//invoking the second constructor of Caesar class with N shift places input
               String secret1 = cipher1.encrypt(plain);        // Encrypt the message with N places shift
               System.out.println("Your message is encrypted as: "+secret1);
               System.out.println();
               break;
               
            case 'b':
               System.out.println("You have chosen the keyword substitution cipher.");
               System.out.print("Enter a keyword and integer:");
               String keyword = sc.next();
               int n = sc.nextInt();
               System.out.println();
               
               KeywordSubstitution K = new KeywordSubstitution(keyword, n);

               System.out.print("Enter a ciphertext message: " );    // Display the results
               sc.nextLine(); //to throw the \n that was created during nextInt() called above
               String plaintext = sc.nextLine();
               System.out.println();
               
               System.out.println("Your message is decrypted as: " + K.encrypt(plaintext));
               
               System.out.println();
               break;
            }
         break;   
       case 2:
         System.out.println("Now, select an encryption method from the following.\na. Caesar cipher\nb. Keyword substitution cipher");
         System.out.print("Enter your choice: ");
         char ch2 = sc.next().charAt(0);
         System.out.println();
         switch(ch2){
            case 'a':
               System.out.print("Enter a nonnegative number of places to shift: "); 
               int N = sc.nextInt(); //taking n shift places from the user
               System.out.println();
               System.out.print("Enter an encrypted message: "); 
               sc.nextLine(); //to throw the \n that was created during nextInt() called above
               String secret2 = sc.nextLine();
               System.out.println();
               Cipher cipher1 = new Caesar(N);//invoking the second constructor of Caesar class with N shift places input
               System.out.println("Your message is decrypted as: "+cipher1.decrypt(secret2));
               System.out.println();
               break;
               
            case 'b':
               System.out.println("You have chosen the keyword substitution cipher.");
               System.out.print("Enter a keyword and integer:");
               String keyword1 = sc.next();
               int n1 = sc.nextInt();
               System.out.println();
               
               KeywordSubstitution K = new KeywordSubstitution(keyword1, n1);

               System.out.print("Enter a ciphertext message: " );    // Display the results
               sc.nextLine(); //to throw the \n that was created during nextInt() called above
               String cipherText = sc.nextLine();
               System.out.println();
               
               System.out.println("Your message is decrypted as: " + K.decrypt(cipherText));
               
               System.out.println();
               break;
            }
        break;   
       case 3:
         System.out.println("You have chosen to exit.");
         quit = true;
         break;
    }
   }while(!quit);
  }
}
