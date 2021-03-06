//This program will convert a 100-scale score into a letter grade. 
import java.util.Scanner;

public class GradeConverter {
   public static void main (String [] args) {
      //Create a Scanner object
      Scanner input = new Scanner(System.in);
      
      //User inputs a 100-scale score 
      System.out.print("Enter a 100-scale score, e.g., 89.5: ");
      double score = input.nextDouble();
      
      //Convert to letter grades P (pass) or F (fail)
      if (score >= 60)
         System.out.println("The letter grade is P (pass).");
      
      if (score < 60)   
         System.out.println("The letter grade is F (Fail).");
         
      //Convert to letter grades A, B, C, D and F using if-else.
      char grade;
      
         /*if (score >= 90)
            grade = 'A';
               else if (score >= 80)
                  grade ='B';
                    else if (score >= 70) 
                     grade ='C';
                      else if (score >= 60) 
                        grade ='D';
                           else grade = 'F';
      //Convert to letter grades using SWITCH
      */ 
      
      switch ((int) score /10) {
         case 10: grade = 'A'; break;
         case 9 : grade = 'A'; break;
         case 8 : grade = 'B'; break;
         case 7 : grade = 'C'; break;
         case 6 : grade = 'D'; break;
         default : grade = 'F';
     
             //Output
      //System.out.println("Your letter grade is" + grade + ".");
   }
}
}