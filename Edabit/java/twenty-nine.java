/*

Create a method that takes an array of doubles and returns the following statistics:
  - min val
  - max val
  - len val
  - avg val
 
*/

import java.util.*;

public class Program
{
  public static double minVal(double[] nums)
  {
    double min = nums[0];

    for (int i = 0; i < nums.length; i++)
      if (nums[i] < min)
        min = nums[i];
    return min;
  }

  public static double maxVal(double[] nums)
  {
    double max = nums[0];

    for (int i = 0; i < nums.length; i++)
      if (nums[i] > max)
        max = nums[i];
    return max;
  }

  public static double avgVal(double[] nums)
  {
    double avg = 0;

    for (int i = 0; i < nums.length; i++)
      avg += nums[i];
    return (avg / nums.length);
  }

  public static double[] minMaxLengthAverage(double[] nums)
  {
    return new double[]{minVal(nums), maxVal(nums), nums.length, avgVal(nums)};
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n",
      Arrays.toString(minMaxLengthAverage(new double[]{6, 9, 15, -2, 92, 11}))
    );
  }
}
