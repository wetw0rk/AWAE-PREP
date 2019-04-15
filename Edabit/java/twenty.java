/*
 
Create a method that takes an array of integers and returns a new array,
sorted in ascending order (smallest to biggest). 

- Sort integer array in ascending order.
- If functions argument is an empty array, return an empty array.
- Return new array of sorted integers.

*/

import java.util.Arrays;

public class Program
{
  public static int[] sortNumsAscending(int[] nums)
  {
    Arrays.sort(nums);
    return nums;
  }

  public static void main(String[] args)
  {
    int[] arr1 = new int[]{1, 2, 10, 50, 5};
    int[] arr2 = new int[]{};

    System.out.println(Arrays.toString(sortNumsAscending(arr1)));
    System.out.println(Arrays.toString(sortNumsAscending(arr2)));
  }
}
