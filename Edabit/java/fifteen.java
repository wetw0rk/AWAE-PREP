/*

Create a method that takes a string and returns the word count.
The string will be a sentence. 
 
*/

public class Program
{
  public static int countWords(String s)
  {
    return s.split(" ").length;
  }

  public static void main(String[] args)
  {
    System.out.printf("%d\n", countWords("Just an example here move along"));
  }
}
