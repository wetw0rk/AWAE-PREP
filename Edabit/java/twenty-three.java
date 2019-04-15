/*

Create a method that alternates the case of the letters in a string.
 
*/

import java.util.Arrays;

public class Program
{
  public static String alternatingCaps(String s)
  {
    char[] arr = s.toCharArray();
    String ret = "";

    for (int i = 0; i < arr.length; i++)
      if (i % 2 == 0)
        ret += Character.toUpperCase(arr[i]);
      else
        ret += Character.toLowerCase(arr[i]);

    return ret;
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", alternatingCaps("Hello"));
    System.out.printf("%s\n", alternatingCaps("HeY, hOw aRe yOu?"));
    System.out.printf("%s\n", alternatingCaps("OMG!!! This website is awesome!!"));
  }
}
