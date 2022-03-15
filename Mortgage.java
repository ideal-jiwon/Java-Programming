/*pseudocode
PART B Q02
Start

      "READ TransUnion" : TransUnion = input("Please Enter your TransUnion Credit Score")
         "GET TransUnion" : TransUnion 
      "READ EquiFax" : EquiFax = input("Please Enter your EquiFax Credit Score")
         "GET EquiFax" : EquiFax 
      "READ Experian" : Experian = input("Please Enter your Experian Credit Score")
         "GET Experian" : Experian 
      "GET ACS" : ACS == (TransUnion + EquiFax + Experian)/3
         
      "IF" ACS is between 740 and 850 "THEN"
         "CALL" Eligibity : Yes and Interest Rate Qualified : 2.75%
      "ELSE IF" ACS is between 670 and 739 "THEN"
         "CALL" Eligibility :Yes and Interest Rate Qualified : 3.15%
      "ELSE IF" ACS is between 580 and 669 "THEN"
         "CALL" Eligibility : Yes and Interest Rate Qualified : 3.50%
      "ELSE IF" ACS is 579 or below than 579 "THEN"
         "CALL" Eligiblity : No  
         
      
End*/



//Q03//
// Step1:  program uses class Scanner
import java.util.Scanner;

public class Mortgage 
   // Main method begins execution of Java application
{
   public static void main( String[] args ) 
      // Step 2: create Scanner to obtain input from command line
   {
      Scanner sc = new Scanner(System.in);
      
      int TransUnion;
      int EquiFax;
      int Experian;
      
      // Steps 3 & 4: prompt message and take user input
      System.out.print("Please Enter your credit score from TransUnion (300 - 850) : ");
      TransUnion = sc.nextInt(); //TransUnion
      
      System.out.print("Please Enter your credit score from EquiFax (300 - 850) : ");
      EquiFax = sc.nextInt(); //EquiFax
      
      System.out.print("Please Enter your credit score from Experian (300 - 850) : ");
      Experian = sc.nextInt(); //Experian
      
      // Step 5 : define Average Credit Score as ACS
      
      int ACS = (TransUnion + EquiFax + Experian)/3;
      // Use conditional statement to see if input is within range between 740 and 850 
      if (ACS>=740 && ACS<=850)
      // Display the output
      {System.out.println("Congratulation! You are eligible for the Mortgage at the Interest Rate Qualified : 2.75%");}
      // Use conditional statement to see if input is within range between 670 and 739 
      else if (ACS>=670 && ACS<=739)
      // Display the output
      {System.out.println("Congratulation! You are eligible for the Mortgage at Interest Rate Qualified : 3.15%");}
      // Use conditional statement to see if input is within range between 580 and 669 
      else if (ACS>=580 && ACS<=669)
      // Display the output
      {System.out.println("Congratulation! You are eligible for the Mortgage at  Interest Rate Qualified : 3.50%");}
      // Use conditional statement to see if input is within range below or equal to 579
      else if (ACS<= 579)
      // Display the output
      {System.out.println("I'm Sorry. You are not eligible for the Mortgage this time.");} 

   }
}