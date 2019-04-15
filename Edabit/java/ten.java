/*

Create a method that takes a string and returns a
string in which each character is repeated once. 
 
*/

public class Program
{
  public static String doubleChar(String s)
  {
    String[] arr = s.split("");
    String finalStr = "";

    for (int i = 0; i < arr.length; i++)
      finalStr += arr[i] + arr[i];

    return finalStr;
  }

  public static void main(String[] args)
  {
    System.out.printf("%s\n", doubleChar("String"));
  }
}
