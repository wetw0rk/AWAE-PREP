<?php

class User
{
  public $age  = 0;
  public $name = '';

  public function PrintData()
  {
    echo "User ".$this->name." is ".$this->age." years old.";
  }
}
// Create a user object and call PrintData()
$u = unserialize('O:4:"User":2:{s:3:"age";i:20;s:4:"name";s:6:"Milton";}');
$u->PrintData();

?>
