/*
 
Create a method that takes an integer as its only argument
and returns true if it's less than or equal to zero,
otherwise return false.

*/

public class Program
{
  public static boolean lessThanOrEqualToZero(int num)
  {
    return (num <= 0) ? true : false;
  }

  public static void main(String[] args)
  {
    System.out.printf("%b\n", lessThanOrEqualToZero(5));
    System.out.printf("%b\n", lessThanOrEqualToZero(0));
    System.out.printf("%b\n", lessThanOrEqualToZero(-2));
    System.out.printf("%b\n", lessThanOrEqualToZero(1));
  }
}
