/*

Create a method that takes a string as its argument
and returns the string in reversed order. 
 
*/

public class Program
{
  public static String reverse(final String str)
  {
    return new StringBuffer(str).reverse().toString();
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", reverse("ls"));
  }
}
