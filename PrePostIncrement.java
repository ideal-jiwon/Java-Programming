// This program shows the difference between pre-increment and post-increment
public class PrePostIncrement {
   public static void main(String[] args){
      int i = 1; 
		int j;
		j = i++;//Try change this statement to j = ++i; and see what the output will be.
		System.out.println("i = " + i);
		System.out.println("j = " + j);           
   }
}

