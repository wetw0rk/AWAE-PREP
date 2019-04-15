<?php

class TestClass
{ // a variable
  public $variable = "This is a string"."\n";
  // simple method
  public function PrintVariable()
  {
    echo $this->variable;
  }
}

$object = new TestClass(); // create an object
$object->PrintVariable();  // call a method

?>
