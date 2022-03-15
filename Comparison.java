/* Comparison.java
** Compare integers using if statements, relational operators and equality operators.
*/
// Step1:  program uses class Scanner
import java.util.Scanner;  

public class Comparison {
   // Main method begins execution of Java application
   public static void main(String[] args) {
      // Step 2: create Scanner to obtain input from command line
      Scanner input = new Scanner(System.in);

      int number1; 
      int number2;
      int larger;
      int smaller;
      
      // Steps 3 & 4: prompt message and take user input 

      System.out.print("Enter second integer: ");  
      number2 = input.nextInt();  
         
      // Use conditional statement to compare the two numbers and get the larger / smaller numbers. 
      if (number1 >= number2)
      {
         larger = number1;
         smaller = number2;
      }  
      else
      {
         larger = number2;
         smaller = number1;    
      }   
       
      // Display the output
      System.out.printf( "The larger number is %d, and the smaller number is %d.\n", larger, smaller );   
   } 
} 