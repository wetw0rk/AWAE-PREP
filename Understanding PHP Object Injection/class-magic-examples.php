<?php

class TestClass
{
  public $variable = "This is a string";
  
  public function PrintVariable() // simple method
  {
    echo $this->variable."\n";
  }
  public function __construct() // constructor
  {
    echo "__construct\n";
  }
  public function __destruct() // destructor
  {
    echo "__destruct\n";
  }
  public function __toString()
  {
    return "__toString\n";
  }
}

$object = new TestClass(); // create an object, this will
                           // call __construct

$object->PrintVariable();  // call the method, this will
                           // print "This is a string"

echo $object;              // object will act as a string
                           // and will call __toString

// end of PHP script, call __destruct

?>
