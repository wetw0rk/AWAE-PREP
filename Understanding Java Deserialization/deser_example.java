// run using: java <program>

import java.io.*;

public class Userial
{
  public static void main(String[] args)
  {
    String name;
    String filename = "file.bin";

    try
    {
      FileInputStream file  = new FileInputStream(filename);
      ObjectInputStream out = new ObjectInputStream(file);

      // deserialization of the object (String)
      // will be written to STDOUT
      name = (String) out.readObject();
      System.out.println(name);

      out.close();
      file.close();
    }
    catch (Exception e)
    {
      System.out.printf("Exception: %s\n", e.toString());
    }
  }
}
