/*

Create a method that takes an integer as an argument. Add up all the numbers
from 1 to the number you passed to the function. For example, if the input is
4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.

*/

public class Program
{
  public static int addUp(int num)
  {
    int f = num;
    for (int i = 0; i < num; i++)
      f += i;
    return f;
  }

  public static void main(String[] args)
  {
    System.out.printf("%d\n", addUp(4));
    System.out.printf("%d\n", addUp(13));
    System.out.printf("%d\n", addUp(600));
  }
}
