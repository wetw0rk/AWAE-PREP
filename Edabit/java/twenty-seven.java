/*
 
Create a method that takes an array of strings. Return all words in the
array that are exactly four letters.

*/

import java.util.*;

public class Program
{
  public static String[] isFourLetters (String[] s)
  {
    int ct = 0;
    int j = 0;
    
    for (int i = 0; i < s.length; i++)
      if (s[i].length() == 4)
        ct++;
    String[] arr = new String[ct];
    
    for (int i = 0; i < s.length; i++)
      if (s[i].length() == 4)
        arr[j++] = s[i];
    return arr;
  }

  public static void main(String[] args)
  {
    String[] a = {"Ryan", "Kieran", "Jason", "Matt"};

    System.out.printf("%s\n",
      Arrays.toString(isFourLetters(a))
    );
  }
}
