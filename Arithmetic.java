/*MIS350 New HW2 Q4
  FEB/13/2022
  JIWON MOK
  This program calculates sum, average, and product
  of three user-input integers
  minimal and maximal values of the three user input integers.
  
*/ 

import java.util.Scanner;

public class Arithmetic 
{
   public static void main( String[] args ) 
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the first integer : ");
      int number_1 = sc.nextInt();
      
      System.out.print("Enter the second integer : ");
      int number_2 = sc.nextInt();
      
      System.out.print("Enter the thrid integer : ");
      int number_3 = sc.nextInt();
 
      
      int sum = number_1 + number_2 + number_3;
      double average = (double)(number_1 + number_2 + number_3)/3;
      int product = number_1*number_2*number_3;
      
      System.out.printf( "The sum of %d, %d, %d is %d.\n", number_1, number_2, number_3, sum);
      System.out.printf( "The average of %d, %d, %d is %f.\n", number_1, number_2, number_3, average);
      System.out.printf( "The product of %d, %d, %d is %d.\n", number_1, number_2, number_3, product);
      
      // max number 
      if(number_3 > number_2 && number_3 > number_1)
      {
         System.out.printf("%d is greatest among three", number_3);
      }
      if(number_2>number_1 && number_2 > number_3)
      {
         System.out.printf("%d is greatest among three", number_2);
      }
      if(number_1>number_3 && number_1 > number_2)
      {
         System.out.printf("%d is greatest among three", number_1);      
      }
      
      // min number
       
      if(number_3 <= number_2 && number_3 <= number_1)
      {
         System.out.printf("%d is smallest", number_3);
      }
      if(number_2 <= number_1 && number_2 <= number_3)
      {
         System.out.printf("%d is smallest", number_2);
      }
      if(number_1 >= number_3 && number_1 >= number_2)
      {
         System.out.printf("%d is smallest", number_1);      
      }
      
      
   }
 }  
   
      
   


      

      
      
      
      
