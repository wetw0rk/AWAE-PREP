/*
 
Usually when you sign up for an account to buy something, your credit card number, phone number or answer to a secret question is partially obscured in some way. Since someone could look over your shoulder, you don't want that shown on your screen. Hence, the website masks these strings.

Your task is to create a method that takes a string, transforms all but the last four characters into "#" and returns the new masked string.

*/

import java.util.*;

public class Program
{
  public static String maskify(String s)
  {
    int lc = 0;
    String nstr = "";

    if (s.length() > 4)
      lc += (s.length() - 4);
    else
      return s;

    char[] arr = s.toCharArray();    
    for (int i = 0; i < lc; i++)
      arr[i] = '#';
    nstr += new String(arr);


    return nstr;
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", maskify("123456"));
  }
}
