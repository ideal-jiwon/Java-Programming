import java.util.Scanner;  

public class EvenOdd {
   //Main method begins execution of Java application
   public static void main(String[] args) {
   // Step 2: create Scanner to obtain input from command line
       Scanner input = new Scanner(System.in);
       int number;
       System.out.print("Enter the integer number: ");  
       number = input.nextInt(); 
          
      if (number%2==0)// even number
      {
         System.out.printf("%d is an even number.",number);
      }  
      else //odd number
      {
        System.out.printf("%d is an odd number.", number);
      }   
   }
 
 }      
  
