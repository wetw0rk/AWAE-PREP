/*

Take an array of integers (positive or negative or both) and return
the sum of the absolute value of each element.

*/

import java.util.stream.*;

public class Program
{
  public static int getAbsSum(int[] nums)
  {
    int sum = 0;
    for (int i = 0; i < nums.length; i++)
      sum += Math.abs(nums[i]);
    return sum;
  }

  public static void main(String[] args)
  {
    System.out.printf("%d\n", getAbsSum(new int[]{2, -1, 4, 8, 10}));
  }
}
