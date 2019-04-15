/*
 
Create a method that takes a single string as argument and returns
an ordered array containing the indexes of all capital letters in
the string.

*/

import java.util.*;

public class Program
{
  public static int[] indexOfCaps(String s)
  {
    char[] arr = s.toCharArray();
    int ct = 0;
    int i = 0;

    for (i = 0; i < arr.length; i++)
      if (Character.isUpperCase(arr[i]))
        ct++;
    int d_arr[] = new int[ct];

    i = 0;
    for (int j = 0; j < arr.length; j++)
      if (Character.isUpperCase(arr[j]))
        d_arr[i++] = j;
    
    return d_arr;
  }

  public static void main(String[] args)
  {
    System.out.println(Arrays.toString(indexOfCaps("eDaBiT")));
    System.out.println(Arrays.toString(indexOfCaps("eQuINoX")));
    System.out.println(Arrays.toString(indexOfCaps("determine")));
    System.out.println(Arrays.toString(indexOfCaps("STRIKE")));
    System.out.println(Arrays.toString(indexOfCaps("sUn")));
  }
}
