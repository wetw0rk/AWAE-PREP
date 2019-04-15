/*

Create a method that takes an array of names and returns
an array with the first letter capitalized.
 
*/

import java.util.*;

public class Program
{
  public static String[] capMe(String[] s)
  {
    String[] nstr_arr = new String[s.length];

    for (int i = 0; i < s.length; i++)
    {
      char[] arr = s[i].toCharArray();
      for (int j = 0; j < arr.length; j++) {
        arr[0] = Character.toUpperCase(arr[0]);
        arr[j] = Character.toLowerCase(arr[j]);
      }
      nstr_arr[i] = new String(arr);
    }

    return nstr_arr;
  }

  public static void main(String[] args)
  {
    System.out.println(
      Arrays.toString(
        capMe(new String[]{"mavis", "senaida", "letty"})
      )
    );
    System.out.println(
      Arrays.toString(
        capMe(new String[]{"samuel", "MABELLE", "letitia", "meridith"})
      )
    );
  }
}
