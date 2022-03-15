/*Jiwon Mok
Feb 27 2022
PART C 
HW5*/

import java.util.Scanner;
import java.util.Random;

public class SubtractionQuizFor {
  public static void main(String[] args) {
    
    // Create objects for a Scanner and a Random
    Scanner input = new Scanner(System.in);
    Random rNums = new Random();
    
    // Declare and initialize two numbers
    int n1;
    int n2;
    int correct = 0, incorrect = 0;
    
    // Make a repetition structure
    for (int qcount = 0; qcount <10; qcount ++) {
    // Generate two random integer numbers
    n1 = rNums.nextInt(16);
    n2 = rNums.nextInt(16);
    // Swap n1 to n2 if n1 < n2
      if (n1 < n2) {
      
      int temp = n1;
         n1 = n2;
         n2 = temp;
      }
    // Prompt the question  
    System.out.print(
     "What is " + n1 + " - " + n2 + "? ");
     
   // Take user input answer
    int answer = input.nextInt();
   // Print the question, answer and quiz result 
    if (n1 - n2 == answer){
       correct ++; //correct = correct +1;
      }
      else {
         incorrect ++; //incorrect = incorrect +1;
      }
  }
      // Display the quiz summary
      System.out.printf ("In this quiz you got %d correct and %d incorrect in your 10 questions.\n",correct, incorrect);
  }
}