/*
 
Create a method that accepts a string (of a persons first and last name) and
returns a string with the first and last name swapped.

*/

public class Program
{
  public static String nameShuffle(String s)
  {
    String[] arr = s.split(" ");

    return String.format("%s %s", arr[1], arr[0]);
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", nameShuffle("Milton Valencia"));
  }
}
