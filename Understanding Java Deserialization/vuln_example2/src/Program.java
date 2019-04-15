import java.io.*;

public class Program
{
  public static void main(String[] args)
  {
    LogFile obj = new LogFile();
    String file = "Example.ser";

    // deserialization of the object
    Utils.DeserializeFromFile(file);
  }
}
