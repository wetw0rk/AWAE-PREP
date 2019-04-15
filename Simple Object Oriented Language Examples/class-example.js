<script>

/*

Author: wetw0rk

Very simple example of object oriented programming in JavaScript

*/

class Picture
{
  constructor(id, title, img)
  {
    this.id     = id;
    this.title  = title;
    this.img    = img;
  }
  display_values()
  {
    console.log("id:%s, title:%s, img:%s",
      this.id,
      this.title,
      this.img
    );
  }
}

let example = new Picture("1", "wetw0rk", "file.png");
example.display_values();

</script>
