/*

Create a function that takes an array of numbers and returns the mean value.
 
*/

import java.util.*;

public class Program
{
  public static double mean(int[] nums)
  {
    double avg = 0;

    for (int i = 0; i < nums.length; i++)
      avg += nums[i];

    return Math.round((avg / nums.length) * 100.0 ) / 100.0;
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", mean(new int[]{1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
    System.out.printf("%s\n", mean(new int[]{1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
  }
}
