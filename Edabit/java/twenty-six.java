/*

You will be implementing a basic case of the map-reduce pattern in programming.
Given a vector stored as an array of numbers, find the magnitude of the vector.
Use the standard distance formula for n-dimensional Cartesian coordinates. 
 
*/

import java.util.*;

public class Program
{
  public static double magnitude(int[] nums)
  {
    double mag = 0;

    for (int i = 0; i < nums.length; i++)
      mag += Math.pow(nums[i],2);

    return Math.sqrt(mag);
  }

  public static void main(String[] args)
  {
    System.out.printf("%f\n", magnitude(new int[]{3, 4}));
  }
}
