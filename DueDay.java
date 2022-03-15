import java.util.Scanner;  

public class DueDay {
   // Main method begins execution of Java application
   public static void main(String[] args) {
      // Step 2: create Scanner to obtain input from command line
      Scanner cs = new Scanner(System.in);
      
      //define variables first
      String name = new String();
      int day;
      int duration;
      int due_day;
      
      // Steps 3 & 4: prompt message and take user input 
      System.out.println("Please enter the assignment name: ");  
      name = cs.nextLine(); 
      
      System.out.printf("Please enter the day number in a week that %s has been assigned: .\n (Make sure you enter 0 for Sunday, 1 for Monday... 6 for Saturday.)", name);  
      day = cs.nextInt();
      
      System.out.printf("How many days you are allowed to complete %s? .\n (Make sure you enter an integer number like 10,20, etc. ", name);  
      duration = cs.nextInt();
      
      //define due_day based on the input above
      due_day = ((day + duration)%7);
       // Display the output using switch
      switch (due_day) 
      {
      case 0: System.out.printf("%s will be due on a Sunday", name); break;
      case 1: System.out.printf("%s will be due on a Monday", name); break;
      case 2: System.out.printf("%s will be due on a Tuesday", name); break;
      case 3: System.out.printf("%s will be due on a Wednesday", name); break;
      case 4: System.out.printf("%s will be due on a Thursday", name); break;
      case 5: System.out.printf("%d will be due on a Friday", name); break;
      case 6: System.out.printf("%d will be due on a Saturday", name); break;
      }    
   }
  }      