/*

Create a function that takes a two strings and returns true if
the first argument ends with the second argument; otherwise
return false.

*/

public class Program
{
  public static boolean checkEnding(String str1, String str2)
  {
    return str1.endsWith(str2);
  }

  public static void main(String[] args)
  {
    System.out.printf("%b\n", checkEnding("abc", "bc"));
  }
}
