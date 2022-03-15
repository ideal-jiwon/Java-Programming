/* qustion 03 */

import java.util.Scanner;

public class TempConvertor 
{
   public static void main( String[] args ) 
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Type the current Fahrenheit degree  : ");
      
      double Fah = sc.nextDouble();
      
      double Cel = (5.0/9.0)*(Fah - 32);
      
      System.out.printf("Fahrenheit degree %f, is same as Celsius %f, degree.", Fah, Cel);
   }
}

      

