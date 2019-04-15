<?php

class User
{
  public $age  = 0;
  public $name = '';

  public function PrintData()
  {
    echo "User ".$this->name." is ".$this->age.
      " years old.";
  }
}

$user = new User();

$user->age  = 20;
$user->name = "Milton";

$user->PrintData();

// serialize object and print output
echo serialize($user)."\n";

?>
