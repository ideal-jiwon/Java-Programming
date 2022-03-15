//This program will demonstrate errors caused by data range
public class DataTypeErrors {
   public static void main(String[] args){
      //Error1
      byte i = 100; //compiler error
      System.out.println("The value for i is: " + i);
      
      //Error2
      int a = 97; //compiler error
      System.out.println("The value for a is: " + a);
      
      //Error3
      int num = 2147483647 + 1; //logic error: integer overflow error
      System.out.println("The value for num is: " + num);      
   }
}