/*
 
Create a method that accepts a string of space separated numbers
and returns the highest and lowest number (as a string). 
 
*/

import java.util.*;

public class Program
{
  public static int minVal(int[] nums)
  {
    int min = nums[0];

    for (int i = 0; i < nums.length; i++)
      if (nums[i] < min)
        min = nums[i];
    return min;
  }
  public static int maxVal(int[] nums)
  {
    int max = nums[0];

    for (int i = 0; i < nums.length; i++)
      if (nums[i] > max)
        max = nums[i];
    return max;
  }
  public static String highLow(String s)
  {
    String[] arr = s.split(" ");
    int[] narr = new int[arr.length];

    for (int i = 0; i < narr.length; i++)
      narr[i] = Integer.parseInt(arr[i]);

    return String.format("%s %s", maxVal(narr), minVal(narr));
  }
  public static void main(String[] args)
  {
    System.out.printf("%s\n", highLow("1 2 3 4 5"));
    System.out.printf("%s\n", highLow("1 2 -3 4 5"));
    System.out.printf("%s\n", highLow("1 9 3 4 -5"));
    System.out.printf("%s\n", highLow("13"));
  }

}
