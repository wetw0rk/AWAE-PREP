/*

Create a function that takes a string and returns the middle character(s).
If the word's length is odd, return the middle character. If the word's
length is even, return the middle two characters.
 
*/

import java.util.*;

public class Program
{
  public static String getMiddle(String word)
  {
    char[] arr = word.toCharArray();
    int mid = arr.length/2;
    
    if (arr.length % 2 == 0) 
      return String.format("%s%s", arr[mid-1], arr[mid]);
    return String.format("%s", arr[mid]);
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", getMiddle("test"));
    System.out.printf("%s\n", getMiddle("testing"));
    System.out.printf("%s\n", getMiddle("middle"));
    System.out.printf("%s\n", getMiddle("A"));
  }
}
