import java.io.*;

// Vulnerable Class
class LogFile implements Serializable
{
  public String filename;
  public String filecontent;

  // function called during deserialization
  private void readObject(ObjectInputStream in)
  {
    System.out.println("readObject from LogFile");

    try
    {
      // deserialize data
      in.defaultReadObject();
      System.out.printf("File name: %s, File content: %s\n",
        filename, filecontent
      );
      // do something useful with the data and restore
      // LogFile, write file content to filename
      FileWriter file    = new FileWriter(filename);
      BufferedWriter out = new BufferedWriter(file);

      System.out.println("Restoring log data to a file...");
      out.write(filecontent);

      out.close();
      file.close();
    }
    catch (Exception e)
    {
      System.out.printf("Exception: %s\n", e.toString());
    }
  }
}
