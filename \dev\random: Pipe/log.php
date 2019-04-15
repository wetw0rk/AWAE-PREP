<?php
class Log
{
    public $filename = '';
    public $data = '';

    public function __construct()
    {
      $this->filename = '';
	    $this->data = '';
    }

    public function PrintLog()
    {
      $pre = "[LOG]";
	    $now = date('Y-m-d H:i:s');

      $str = '$pre - $now - $this->data';
      eval("\$str = \"$str\";");
      echo $str;
    }

    public function __destruct()
    {
	    file_put_contents($this->filename, $this->data, FILE_APPEND);
    }
}
?>
