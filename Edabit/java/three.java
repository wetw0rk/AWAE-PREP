/*
   
Create a method that accepts an array and returns the last item in the array.

*/

public class Program
{
  public static int getLastItem(int[] nums)
  {
    return nums[nums.length-1];
  }

  public static void main(String[] args)
  {
    System.out.printf("%d\n", getLastItem(new int[]{1, 2, 3}));
  }
}
