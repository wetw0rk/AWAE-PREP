/*

Create a function that takes an array and a string as
arguments and return the index of the string.

*/

public class Program
{
  public static int findIndex(String[] arr, String str)
  {
    int i;
    for (i = 0; i < arr.length; i++)
      if (arr[i] == str)
        break;
    return i;
  }

  public static void main(String[] args)
  {
    System.out.printf("%d\n",
      findIndex(new String[]{"hi", "edabit", "fgh", "abc"}, "fgh")
    );
  }
}
