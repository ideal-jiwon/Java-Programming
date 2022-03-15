import java.util.Random;
import java.util.Scanner;

public class TypingPractice {
  public static void main(String[] args) {
    
    // Create a Scanner
   Scanner input = new Scanner(System.in);
   Random rnd = new Random(); 
      
    int correct = 0, incorrect = 0;
    char n;     
    
    
    // 1. Declare long variables for starting time, ending time, and time elapsed
    long startTime, endTime;
    long elapsedTime = 0;
    
    // 2. Take starting time
    startTime = System.currentTimeMillis();
    
    // 3. Prompt question
    while (elapsedTime / 1000 <= 10) {
      
      n = (char)('a' + rnd.nextInt(26));

      System.out.print( "Please type  " + n + " : ");
         char answer = input.next().charAt(0);
      
      
      if (n == answer) {
           correct ++; // correct = correct + 1
         }
      else  {
            incorrect ++; // incorrect = incorrect + 1
         }
   
   // 4. Take ending time and calculate time elapsed
       
       endTime = System.currentTimeMillis();
       elapsedTime = endTime - startTime;
       
    }
       int total = (correct+incorrect) ;
       double per = ((double)correct/total)*100;
   // 5. Print    
      System.out.printf ("Congrats! you got %d,and %d, and %d, and %.2f%%", total, correct, incorrect, per);
   
  }
}

        
    

    
    

   