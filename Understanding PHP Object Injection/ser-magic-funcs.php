<?php

class Test
{
  public $variable  = "BUZZ";
  public $variable2 = "OTHER";

  public function PrintVariable() {
    echo $this-> variable."\n";
  }
  public function __construct() {
    echo "__construct\n";
  }
  public function __destruct() {
    echo "__destruct\n";
  }
  public function __wakeup() {
    echo "__wakeup\n";
  }
  public function __sleep() {
    echo "__sleep\n";
    return ['variable', 'variable2'];
  }
}
  $obj = new Test();         // 1. Create an object; will call __construct
  $ser = serialize($obj);    // 2. serialize() object; will call __sleep
  
  // print serialized string
  echo "Serialize Object: ".$ser."\n";

  $obj2 = unserialize($ser); // 3. unserialize() object string, will call __wakeup
  $obj2->PrintVariable();    // 4. call PrintVariable, will echo BUZZ
  // 5. PHP script end; call __destruct for both objects

?>
