/*This program helps a first grader practice additions. 
The program randomly generates two single-digit integers 
number1 and number2 and displays a question such as 
What is 7 + 9? to the student. After the student types 
the answer, the program displays a message to indicate 
whether the answer is true or false.
*/
import java.util.Scanner;
import java.util.Random;

public class SentinelAdditionQuiz {
   public static void main(String[] args) {
    
    // Create a Scanner
      Scanner input = new Scanner(System.in);
      Random rNums = new Random(); 
   
    // Declare and initialize two numbers
      int n1;
      int n2;
      int qcount = 0, correct = 0, incorrect = 0; 
    
    // 1. Generate numbers for the 1st question 
      n1 = rNums.nextInt(11); 
      n2 = rNums.nextInt(11); 
    
    // 2. Display the 1st question and take answer
      System.out.print(
      "What is " + n1 + " + " + n2 + "? Or enter -1 to stop :");
      int answer = input.nextInt();
    
    // Make a repetition structure
    // 4. Modify the condition - using time elapsed to control the loop
      while (answer != -1) {
       //Print
       if (n1 + n2 == answer) {
            System.out.println("Correct!");
            correct ++; // correct = correct + 1
         }
         else {
            System.out.println("Incorrect!");
            incorrect ++; // incorrect = incorrect + 1
         }

       /* Generate two random integer numbers for the next question
       n1 = (int)(Math.random() * 11);
       n2 = (int)(Math.random() * 11);
       */
       // Generate two random integer numbers for addition using the Random class
         n1 = rNums.nextInt(11); 
         n2 = rNums.nextInt(11);   
      
       // Prompt the next question 
         System.out.print(
            "What is " + n1 + " + " + n2 + "? Or enter -1 to stop: ");
       
       // Take user input answer
          answer = input.nextInt();
      
       // Print the question, answer and quiz result.
                     
       // Modify the counter variable for the loop control
         qcount ++; // qcount = qcount + 1
       
       // 3. Take ending time and calculate time elapsed
      }
    
    //Quiz summary 
    //5. Modify the output message
      System.out.printf("You have completed %d questions. \nYou got %d questions correct and %d questions incorrect.\n", (correct + incorrect),correct, incorrect);
   }
}


