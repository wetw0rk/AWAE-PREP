/*

There is a single operator in Java capable of providing the remainder
of a division operation. Two numbers are passed as parameters. The
first provider divided by the second parameter will have a remainder,
possiby zero. Return that value.

*/


public class Program
{
  public static int myMethod(int a, int b)
  {
    return a % b;
  }

  public static void main(String[] args)
  {
    System.out.printf("%d\n", myMethod(1, 3));
    System.out.printf("%d\n", myMethod(-9, 45));
    System.out.printf("%d\n", myMethod(5, 5));
  }
}
