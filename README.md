# power-of

Exam exercise as part of a course in Object oriented programming.

Instructions for the excersise as follows:

Write a PowerOf class. The user then enters a number (of type double) through the keyboard. Another number (of type integer) should be stored in a textile.
Write a program to find and display the value of keyboard number raised to the power of the file number. NOTE: You must not use a Java built-in method for the raised to the power of. i.e java.lang.Math.pow(). Instead use a loop to compute the value. Example: The user enters 4.5 and the number in the text file is 3, then the correct value to display would be 4.53 = 4.5 ∗ 4.5 ∗ 4.5 = 91.125, i.e. 4.5 to the power of 3

The class PowerOf should have the following fields:

- userNumber - Holds a floating point value (of type double), i.e the number entered by the user

- fileNumber - Holds a integer value, i.e a number saved in the text file before executing this program

- filePath - Holds the path to the file including the file name (as a String)

- The class must have the following methods

  - Constructor - The constructor accepts a path to the text file and stores it in the filePath field.

  - setUserNumber - This method asks the user to enter a value (as a double) and stores it in the userNumber field.

  - getUserNumber - Returns the value of the userNumber field.

  - computePowerOf - Computes the user number to the power of the

    text file number and returns the resulting value (as a double)

  - getFileValue - Reads the text file and returns the integer value

  - this class must not contain a main method

  - add appropriate get and set methods for this class' fields

- By default in this exercise: The text file must be found using the file name only, e.g. "myfile.txt" as an argument to the constructor.

Demonstrate the PowerOf class by writing a separate class that asks the user for a path to the text file. This class must hold the main method, so the execution starts in here. The program should create an instance of the PowerOf class, and use the path entered by the user to the constructor. The program should then call the object's methods to display and demonstrate the PowerOf class.

