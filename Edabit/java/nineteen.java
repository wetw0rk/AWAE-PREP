/*
 
Create a method that takes an array of integers and returns an array where
each integer is the sum of itself + all previous numbers in the array. 
 
*/

import java.util.Arrays;

public class Program
{
  public static int[] cumulativeSum(int[] nums)
  {
    int[] arr = new int[nums.length];
    int j = 0;

    for (int i = 0; i < (nums.length); i++)
    {
      arr[i] = nums[i];
      while (j != i)
        arr[i] += nums[j++];
      j = 0;
    }

    return arr;
  }

  public static void main(String[] args)
  {
    int[] arr1 = new int[]{1, 2, 3};
    int[] arr2 = new int[]{1, -2, 3};
    int[] arr3 = new int[]{3, 3, -2, 408, 3, 3};

    System.out.println(Arrays.toString(cumulativeSum(arr1)));
    System.out.println(Arrays.toString(cumulativeSum(arr2)));
    System.out.println(Arrays.toString(cumulativeSum(arr3)));
  }
}
