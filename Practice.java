import java.util.Scanner;

public class Practice {
   // main method begins execution of Java application
   public static void main( String[] args ) {
      // Step 2: Create a Scanner object to obtain user input
      Scanner input = new Scanner(System.in);
                     

      int n1; // first number to add   
      int n2; //
      
      System.out.print("Enter the first integer : ");
      n1 = input.nextInt();
      
      System.out.print("Enter the second integer:");
      n2 = input.nextInt();
      
      
      System.out.printf ("%s\t%s\t%s\n%d < %d\n", "Welcome", "to", "MIS350!", n1, n2);  
   }
}
