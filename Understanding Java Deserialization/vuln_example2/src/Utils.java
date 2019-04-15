import java.io.*;

class Utils
{
  // function to serialize an object and write it to a file
  public static void SerializeToFile(Object obj, String filename)
  {
    try
    {
      FileOutputStream file  = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // serialization of the object to file
      System.out.printf("Serializing %s to %s\n", 
        obj.toString(), filename
      );
      out.writeObject(obj);

      out.close();
      file.close();
    }
    catch (Exception e)
    {
      System.out.printf("Exception: %s\n", e.toString());
    }
  }
  // function to deserialize an object from a file
  public static Object DeserializeFromFile(String filename)
  {
    Object obj = new Object();

    try
    {
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(file);

      // deserialization of the object to file
      System.out.printf("Deserializing from %s\n", filename);
      obj = in.readObject();

      in.close();
      file.close();
    }
    catch (Exception e)
    {
      System.out.printf("Exception: %s\n", e.toString());
    }

    return obj;
  }
}
