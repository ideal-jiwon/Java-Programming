// Addition program that displays the sum of two integer numbers.
// program uses class Scanner for user input
// Step 1: import Scanner class 

import java.util.Scanner;

public class Addition {
   // main method begins execution of Java application
   public static void main( String[] args ) {
      // Step 2: Create a Scanner object to obtain user input
      Scanner input = new Scanner(System.in);
                     

      int number1; // first number to add   
      int number2; // second number to add  
      int sum; // a varaible to store the additional result of number1 and number2

      //Step 3: Prompt for users to input value 
      
      System.out.print("Enter the first integer : ");
      
      //Step 4: Take an integer value from user input and assign to a variable
      
      number1 = input.nextInt();
      
      
      //Repeat Steps 3 & 4 for another integer value
      System.out.print("Enter the second integer:");
      number2 = input.nextInt();
      
      
      sum = number1 + number2; // add numbers, then store total in sum

      System.out.printf( "The sum of %d + %d is %d.\n", number1, number2, sum ); // display sum
   } // end method main
} // end class Addition