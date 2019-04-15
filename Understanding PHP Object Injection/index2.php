<?php

class FileClass
{
  public $filename = 'error.log';

  public function __toString()
  {
    return file_get_contents($this->filename);
  }
}

class User
{
  public $age = 0;
  public $name = '';

  public function __to_String()
  {
    return "User ".$this->name." is ".$this->age." years old.";
  }
}

$obj = unserialize($_GET['usr']);

echo $obj; // will call __toString method of unserialized object

?>
