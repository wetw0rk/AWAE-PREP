/*

Create a method that takes an integer as an argument and returns
"even" for even integers and "odd" for odd integers.

Run using:
  java one.java

*/

public class Program
{
  // internal function
  public static String isEvenOrOdd(int num)
  {
    return ((num % 2) == 0) ? "even" : "odd";
  }
  // main function
  public static void main(String[] args)
  {
    System.out.printf("%s\n", isEvenOrOdd(3));
  }
}
