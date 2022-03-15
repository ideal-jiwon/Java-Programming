/*This program helps a first grader practice additions. 
The program randomly generates two single-digit integers 
number1 and number2 and displays a question such as 
What is 7 + 9? to the student. After the student types 
the answer, the program displays a message to indicate 
whether the answer is true or false.
*/
import java.util.Scanner;
import java.util.Random;

public class TimeAdditionQuiz {
  public static void main(String[] args) {
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    Random rNums = new Random(); 

    // Declare and initialize two numbers
    int n1;
    int n2;
    int correct = 0, incorrect = 0; 
    
    // 1. Declare long variables for starting time, ending time, and time elapsed
    long startTime, endTime;
    long elapsedTime = 0;
    
    // 2. Take starting time
    startTime = System.currentTimeMillis();
    
    // Make a repetition structure
    // 4. Modify the condition - using time elapsed to control the loop
    while (elapsedTime / 1000 <= 10) {
       
       /* Generate two random integer numbers for addition using Math.random()
       n1 = (int)(Math.random() * 11);
       n2 = (int)(Math.random() * 11);
       */
       // Generate two random integer numbers for addition using the Random class
       n1 = rNums.nextInt(11); 
       n2 = rNums.nextInt(11);   
   
       // Prompt the question 
       System.out.print(
         "What is " + n1 + " + " + n2 + "? ");
       
       // Take user input answer
       int answer = input.nextInt();
   
       // Print the question, answer and quiz result.
       if (n1 + n2 == answer) {
         System.out.println("Correct!");
         correct ++;
     
       }
         else {
            System.out.println("Incorrect!");
            incorrect ++; // incorrect = incorrect + 1
         }
         
       // Modify the counter variable for the loop control
      // qcount ++; // qcount = qcount + 1
       
       // 3. Take ending time and calculate time elapsed
       endTime = System.currentTimeMillis();
       elapsedTime = endTime - startTime;
    }
    
    //Quiz summary 
    //5. Modify the output message
    System.out.printf("You got %d questions correct and %d questions incorrect within 1 minute.\n", correct, incorrect);
  }
}





