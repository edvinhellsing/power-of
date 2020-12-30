/**
 * @author Edvin Hellsing
 * @version 1.1
 */

package newpackage; // Package named 'newpackage'.

import java.util.Scanner; // Import of scanner class from the Java API.
import java.io.*; // Import of classes from the Java API to work with files and IOException.

/**
 * The PowerOf class has the method where the calculation etc takes place.
 */
public class PowerOf {
    private double userNumber; // Number (double) entered by the user.
    private int fileNumber; // number (int) in separat file.
    private String filePath; //.txt file that holds the fileNumber.
 
    /**
     * Constructor
     * @param userFilePathInput the String from user input in the main method in Exam_Exercise class which holds the filePath.
     */
    public PowerOf(String userFilePathInput) {
       this.filePath = userFilePathInput;
    }
 
    /**
     * setFileNumber creates a PrintWriter object, passes the filePath to it and creates an empty file named filePath in current directory, writes the int '3' to it and closes the file. Prints that an int has been saved to filePath.
     * @throws IOException since PrintWriter is used to write the int '3' to filePath.
     */
    public void setFileNumber() throws IOException {
       PrintWriter outputFile = new PrintWriter(this.filePath);
 
       outputFile.print(3);
 
       outputFile.close();
 
       System.out.println("An int has been saved to file " + this.filePath + ".");
    }
 
    /**
     * The method setUserNumber asks the user to enter a value (as a double) and stores it in the userNumber field. Input validation in a while loop (with an assumption that negative numbers isn't accepted).
     * @exception e for try Scanner, and a catch of exception.
     */
    public void setUserNumber() {
       // Create a Scanner object to read keyboard input
       try (Scanner keyboard = new Scanner(System.in); ) {
 
          Double userNumber;
          String promptUserNumber = "Enter a positive number (of type double): ";
          String invalidUserNumber = "That's not a positive number. " + promptUserNumber;
 
          System.out.print(promptUserNumber);
          userNumber = keyboard.nextDouble();
 
          while (userNumber <= 0) {
             System.out.print(invalidUserNumber);
             userNumber = keyboard.nextDouble();
          }
 
          this.userNumber = userNumber;
       }
       catch(Exception e) {
          System.out.println(e);
       }
    }
 
    /**
     * getFileNumber returns the value of the fileNumber, as an int.
     * @return fileNumber
     */
    public int getFileNumber() {
       return this.fileNumber;
    }
    
    /**
     * getUserNumber returns the value of the userNumber, as a double.
     * @return userNumber
     */
    public double getUserNumber() {
       return this.userNumber;
    }
 
    /**
     * computePowerOf computes the userNumber to the power of the fileNumber in a for loop, and prints the result as a double.
     * @throws IOException since getFileValue is used.
     */
    public void computePowerOf() throws IOException {
  
       double result = 1;
       int fileNumber = getFileValue();
       for (int i = 0; i < fileNumber; i++) {
          result = result * this.userNumber; // alt. result =* usernumber;
       }
       System.out.printf(this.userNumber + " to the power of " + fileNumber + " = %.3f.\n", result); // Prints results as output, with a bit nice formating
    }
 
    /**
     * getFileValue opens, reads and closes the text file and returns the integer value.
     * @return fileNumber parsed to an int.
     * @exception IOException due to read with Scanner of fileNumber from the file filePath.
     */
    public int getFileValue() throws IOException {
       File myObj = new File(this.filePath);
       Scanner inputFile = new Scanner(myObj);
       int fileNumber = -1; // Could be used as a boolean in the future with true or false if file is empty or can't be read.
 
       while (inputFile.hasNext()) {
          String input = inputFile.nextLine();
          fileNumber = Integer.parseInt(input);
       }
 
       inputFile.close();
 
       return fileNumber;
    }
}
