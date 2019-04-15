/*
 
Create a method that takes an array of 10 integers (between 0 and 9)
and returns a string of those numbers formatted as a phone number
(e.g. (555) 555-5555).

*/

public class Program
{
  public static String formatPhoneNumber(int[] nums)
  {
    String final_str = "(";
    for (int i = 0; i < nums.length; i++)
    {
      if (i == 3)
        final_str += ") ";
      if (i == 6)
        final_str += '-';
      final_str += Integer.toString(nums[i]);
    }
    return final_str;
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n",
      formatPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
    );
  }
}
