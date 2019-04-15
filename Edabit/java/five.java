/*

Create a method that takes an array of integers. Return the largest integer in the array. 

we could have also done:

  ```
  import static java.util.Arrays.stream;
  
  public static int findLargestNum(int[] nums) {
    return stream(nums).max().getAsInt();
  }
  ```

*/

public class Program
{
  public static int findLargestNum(int[] nums)
  {
    int largest = nums[0];
    for (int i = 0; i < nums.length; i++)
      if (nums[i] > largest)
        largest = nums[i];
    return largest;
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", findLargestNum(new int[]{4,5,1,3}));
  }
}
