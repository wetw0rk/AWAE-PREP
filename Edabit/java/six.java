/*

Create a method that takes an array of integers and returns the smallest number in the set.

*/

import static java.util.Arrays.stream;

public class Program
{
  public static int findSmallestInt(int[] args)
  {
    return stream(args).min().getAsInt();
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", findSmallestInt(new int[]{34,15,88,2}));
  }
}
