/*

Create a method that takes a Map<String, String> and return
the values as a separate array.

We could have also done the following...

  ```
  return dict.values().toArray(new String[0]);
  ```

*/

import java.util.*;

public class Program
{
  public static String[] getValues(Map<String,String> dict)
  {
    Set set = dict.entrySet();    // Get a set of entries
    Iterator i = set.iterator();  // Get an iterator
    String[] final_arr = new String[dict.size()];

    int j = 0; // write key values 2 list
    while(i.hasNext())
    {
      Map.Entry e = (Map.Entry)i.next();
      final_arr[j++] = e.getValue().toString();
    }
    return final_arr;
  }

  public static void main(String[] args)
  {
    Map<String, String> map = new HashMap<String, String>();
    map.put("a", "1");
    map.put("b", "2");
    map.put("c", "3");

    System.out.printf("%s\n",
      Arrays.toString(getValues(map))
    );
  }
}
