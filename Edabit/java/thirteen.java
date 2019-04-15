/*

Create a function that takes a string, checks if it has the same number
of 'x's and 'o's and returns either true or false.
 
*/

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

  public static boolean getXO (String str)
  {
    return (matchesCount(str, 'x') == matchesCount(str, 'o'));
  }

  public static void main(String[] args)
  {
    System.out.printf("ooxx     = %b\n", getXO("ooxx"));
    System.out.printf("xooxx    = %b\n", getXO("xooxx"));
    System.out.printf("ooxXm    = %b\n", getXO("ooxXm"));
    System.out.printf("zpzpzpp  = %b\n", getXO("zpzpzpp"));
    System.out.printf("zzoo     = %b\n", getXO("zzoo"));
  }
}
