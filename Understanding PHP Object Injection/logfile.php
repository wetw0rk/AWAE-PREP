<?php

class Logfile
{
  public $filename = "error.log";

  public function LogData($text)
  {
    echo "Log some data: ".$text."\n";
    file_put_contents($this->filename, $text, FILE_APPEND);
  }
  // destructor will delete the logfile
  public function __destruct()
  {
    echo "__destruct deletes (file): ".$this->filename."\n";
    unlink(dirname(__FILE__)."/".$this->filename);
  }
}

?>
