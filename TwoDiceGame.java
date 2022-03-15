/*Jiwon Mok
Feb 27 2022
PART B
HW5*/

import java.util.Random;

public class TwoDiceGame {
  public static void main(String[] args) {
    // Create objects for  a Random
    Random rNums = new Random();
    // Declare and initialize two numbers   
    int dice1;
    int dice2;
    int qcount = 0, tenorabove = 0;
    //  Make a repetition structure    
    while (qcount < 100){       
    //  Limit the scope from 1-6
    dice1 = rNums.nextInt(6)+1;
    dice2 = rNums.nextInt(6)+1;
    // Print the result 100 times 
    System.out.printf ("Your two dice are %d and %d.\n", dice1, dice2);
    // Take a count when the total value is 10 or above 10     
    if (dice1 + dice2 >= 10){ tenorabove ++; }//correct = coorect +1;
     
   qcount ++;// Modify counter
   }       
    
     // Display the quiz summary
   System.out.printf("You have completed 100 times, within which you got %d times with a total point 10 or above.\n", tenorabove);
}
  }
