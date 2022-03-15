/*This program helps a first grader practice additions. 
The program randomly generates two single-digit integers 
number1 and number2 and displays a question such as 
"What is 7 + 9?" to the student. After the student types 
the answer, the program displays a message to indicate 
whether the answer is true or false.
*/
import java.util.Scanner;
import java.util.Random;

public class AdditionQuiz {
  public static void main(String[] args) {
    
    // Create a Scanner and a Random
    Scanner input = new Scanner(System.in);
    Random rNums = new Random();

    // Declare and initialize two numbers
    int n1;
    int n2;
    int qcount = 0, correct =0, incorrect =0; 

    // 3. Make a repetition structure
    while (qcount < 10){
    
    
    // 1. Generate two random integer numbers for addition using Math.random()
    //n1 = (int)(Math.random()*11);
    //n2 = (int)(Math.random()*11);
    
    
    
    // 2. Generate two random integer numbers for addition using the Random class
    n1 = rNums.nextInt(11);/*0-10*/
    n2 = rNums.nextInt(11);

    // Prompt the question 
    System.out.print(
      "What is " + n1 + " + " + n2 + "? ");
    
    // Take user input answer
    int answer = input.nextInt();

    // Print the question, answer and quiz result.
    if (n1 + n2 == answer){
      System.out.println("Correct.");
      correct ++ ; 
      }
      else {
         System.out.println("Incorrect.");
         incorrect ++;
   }
   
   //Modify counter
   qcount ++; //qcount = qcount +1;
   }
   
   //Display the quiz summary 
   System.out.printf("In this quiz, you got %d correct and %d incorrect in your 10 questions.\n", correct, incorrect);
  }
}