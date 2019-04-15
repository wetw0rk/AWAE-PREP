/*

Author: wetw0rk

Very simple example of object oriented programming in Java

*/

public class Picture
{
  String id, img, title;

  public Picture(String id, String title, String img)
  {
    this.id     = id;
    this.title  = title;
    this.img    = img;
  }
  void display_values()
  {
    System.out.printf("id:%s, title:%s, img:%s\n", this.id, this.title, this.img);
  }
  public static void main(String[] args)
  {
    Picture example = new Picture("1", "wetw0rk", "file.png");
    example.display_values();
  }
}
