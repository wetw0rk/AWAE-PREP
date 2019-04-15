/*

Create a function that takes a string and returns the
number (count) of vowels contained within it.

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

  public static int getCount(String str)
  {
    char vowels[] = {'a', 'e', 'i', 'o', 'u'};
    int finalc = 0;

    for (int i = 0; i < vowels.length; i++)
      finalc += matchesCount(str, vowels[i]);

    return finalc;
  }

  public static void main(String[] args)
  {
    System.out.printf("%d\n", getCount("Celebration"));
    System.out.printf("%d\n", getCount("Palm"));
    System.out.printf("%d\n", getCount("Prediction"));
  }
}
