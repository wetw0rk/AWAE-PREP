/*
 
Christmas Eve is almost upon us, so naturally we need to prepare
some milk and cookies for Santa! Create a method that accepts a
GregorianCalendar object and returns true if it's Christmas Eve
(December 24th) and false otherwise.

Note:
  could have just compared to return val for example 11...

*/

import java.util.GregorianCalendar;

public class Program
{
  public static boolean timeForMilkAndCookies(GregorianCalendar date)
  {
    GregorianCalendar daTime = new GregorianCalendar(2013, 11, 24);
    
    return (
      daTime.get(daTime.DATE)   == date.get(date.DATE)  &&
      daTime.get(daTime.MONTH)  == date.get(date.MONTH)
    );
  }

  public static void main(String[] args)
  {
    GregorianCalendar ac = new GregorianCalendar(2013, 11, 24);
    GregorianCalendar bc = new GregorianCalendar(2013, 0, 23);
    GregorianCalendar cc = new GregorianCalendar(3000, 11, 24);

    System.out.printf("%b\n", timeForMilkAndCookies(ac));
    System.out.printf("%b\n", timeForMilkAndCookies(bc));
    System.out.printf("%b\n", timeForMilkAndCookies(cc));
  }
}
