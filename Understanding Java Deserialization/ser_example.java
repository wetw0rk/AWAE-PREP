// run using: java <program>

import java.io.*;

public class Serial
{
  public static void main(String[] args)
  {
    String name     = "wetw0rk";
    String filename = "file.bin";
    try
    {
      FileOutputStream file  = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // serialization of "name" (String) object
      // will be  written to "file.bin"

      out.writeObject(name);  // write
      out.close();            // close stream
      file.close();           // close fd stream
    }
    catch (Exception e)
    {
      System.out.printf("Exception: %s\n", e.toString());
    }
  }
}
