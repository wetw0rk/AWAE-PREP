/*
 
Create a method that accepts an array of two strings and checks if
the letters in the second string are present in the first string. 
 
*/

import java.util.*;

public class Program
{
  // matchesCount: count occurences of char c in String str1
  public static int matchesCount (String str1, char c)
  {
    int count = 0;
    for (int i = 0; i < str1.length(); i++)
      if (str1.toLowerCase().charAt(i) == c)
        count++;
    return count; 
  }

  public static boolean letterCheck(String[] s)
  {
    char ng[] = s[1].toLowerCase().toCharArray();
    int ct = 0;

    for (int j = 0; j < ng.length; j++)
      if (matchesCount(s[0].toLowerCase(), ng[j]) >= 1)
        ct++;
    return (ct == ng.length) ? true : false;
  }

  public static void main(String[] args)
  {
    System.out.printf("%b\n", letterCheck(new String[]{"trances", "nectar"}));
    System.out.printf("%b\n", letterCheck(new String[]{"compadres", "DRAPES"}));
    System.out.printf("%b\n", letterCheck(new String[]{"parses", "parsecs"}));
  }
}
