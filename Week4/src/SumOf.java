/**
 * Created by abbyr on 15/10/2024
 * COMMENTS ABOUT PROGRAM HERE
 */
public class SumOf
{
   /* sumOf method takes integer parameter and retrun int
    */
   public static int sumOf(int n){
      /*base case stops if n = 1
       */
      if ( n == 1) return 1;
      /*recursion - repeats while base case hasnt been met
       */
      else return n + sumOf(n - 1);
   }

   public static void main(String[] args){
      System.out.println("The sum of the integers up to 3 is " + sumOf(3));
      System.out.println("The sum of the integers up to 5 is " + sumOf(5));
      System.out.println("The sum of the integers up to 10 is " + sumOf(10));
   }
}//class
