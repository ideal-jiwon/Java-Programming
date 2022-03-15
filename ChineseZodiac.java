//This program prompts the user to enter a year and displays the animal for the year.
import java.util.Scanner;

public class ChineseZodiac {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a year, like 2010: ");
    int year = input.nextInt();
    
    // Use a switch structure to display the animal name for the year. 
    // Animal order: Monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, sheep.  
    
    switch (year % 12) {
      case 0: System.out.println("This is year is Monkey year"); break;
      case 1: System.out.println("This is year is rooster year"); break;
      case 2: System.out.println("This is year is dog year"); break;
      case 3: System.out.println("This is year is pig year"); break;
      case 4: System.out.println("This is year is rat year"); break;
      case 5: System.out.println("This is year is ox year"); break;
      case 6: System.out.println("This is year is tiger year"); break;
      case 7: System.out.println("This is year is rabbit year"); break;
      case 8: System.out.println("This is year is dragon year"); break;
      case 9: System.out.println("This is year is snake year"); break;
      case 10: System.out.println("This is year is horse year"); break;
      case 11: System.out.println("This is year is sheep year"); break;
    }
  }
}