/**
 * @author Edvin Hellsing
 * @version 1.1
 */

package newpackage; // Package named 'newpackage'.

import java.util.Scanner; // Import of scanner class from the Java API.

/**
 * The OopExam class holds the main method.
 */
public class OopExam {
   /**
    * Create a Scanner object to read keyboard input, and gets the user's input of the path to the file. If ''.txt' is not written by the user, it is added. Calls the functions.
    * @exception e for try Scanner, and a catch of exception.
    */
   public static void main(String[] args) {
      try (Scanner keyboard = new Scanner(System.in);) {

         String userFilePathInput;

         System.out.print("Enter the path for the file (choose a name): ");
         userFilePathInput = keyboard.nextLine();

         if (!userFilePathInput.endsWith(".txt")) {
            userFilePathInput = userFilePathInput.concat(".txt");
         }

         PowerOf powerOf = new PowerOf(userFilePathInput);
         powerOf.setFileNumber();
         powerOf.setUserNumber();
         powerOf.getUserNumber();
         powerOf.computePowerOf();
         int fileValue = powerOf.getFileValue();
         String.format("%d", fileValue);

      }

      catch(Exception e) {
         System.out.println(e);
      }
   }
}
