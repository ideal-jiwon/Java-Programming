//This is a program to process char values and generate random char value
import java.util.Random;
public class CharValueTesting {
   public static void main(String args []){
      Random rNums = new Random();
      
      // Declare and initialize a char variable
      // 1. Test it with char or int values
      char testValue = 97;
      
      System.out.println(testValue);
      
      // 2. Operations between char and integers 
      System.out.println((char)('a' + 2));
      
      
      // 3. Take a random char value in a - z, lowercase
      System.out.println((char)('a'+rNums.nextInt(26)));

   }
}