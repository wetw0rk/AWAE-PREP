import java.io.*;

public class Program
{
  public static void main(String[] args)
  {
    LogFile obj = new LogFile();
    Utils lol = new Utils();
    String file = "Log.ser";

    obj.filename    = "wetw0rk.log";
    obj.filecontent = "No actions logged";

    Utils.SerializeToFile(obj, file);
  }
}
