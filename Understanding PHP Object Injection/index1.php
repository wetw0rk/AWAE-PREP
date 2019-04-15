<?php

include 'logfile.php';

// some other code that uses the LogFile class
class User
{
  public $age = 0;
  public $name = '';

  public function PrintData()
  {
    echo "User ".$this->name." is ".$this->age." years old.\n";
  }
}

$user = unserialize($_GET['serialized_user']);

?>
