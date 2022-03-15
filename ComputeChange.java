//Case Study: Counting Monetary Units
import java.util.Scanner;

public class ComputeChange {
   public static void main(String[] args) {
      //Create a scanner
      Scanner input = new Scanner(System.in);
      
      //Receive the amount
      System.out.print("Enter an amount in double, for example 11.56: ");
      double amount = input.nextDouble();
      
      int centAmount = (int)(amount * 100);
      
      //Find the number of dollars
      int numberOfDollars = centAmount / 100;
      centAmount = centAmount % 100;
      
      //Find the number of quarters
      int numberOfQuarters = centAmount / 25;
      centAmount = centAmount % 25;
      
      
      //Find the number of dimes
      int numberOfDimes = centAmount / 10;
      centAmount = centAmount % 10;
      
      
      //Find the number of nickels
      int numberOfNickels = centAmount / 5;
      centAmount = centAmount % 5;
            
            
      //Find the number of pennies
      int numberOfPennies = centAmount;
      
      
      // Display results
      System.out.printf("Your amount %f consists of %d dollars, %d quarters, %d dimes, %d nickels, and %d pennies.\n",
         amount, numberOfDollars, numberOfQuarters, numberOfDimes, numberOfNickels, numberOfPennies);
   }  
}