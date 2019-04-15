<?php

/*

Author: wetw0rk

Very simple example of object oriented programming in PHP

*/

class Picture
{
  function __construct($id, $title, $img)
  {
    $this->id     = $id;
    $this->title  = $title;
    $this->img    = $img;
  }
  function display_values()
  {
    echo sprintf("id:%s, ", $this->id);
    echo sprintf("title:%s, ", $this->title);
    echo sprintf("img:%s\n", $this->img);
  }
}

// initialize and call
$example = new Picture("1", "wetw0rk", "file.png");
$example->display_values();

?>
