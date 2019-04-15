<?php

include 'logfile.php';

$obj = new LogFile();

$obj->filename = "somefile.log";
$obj->LogData("test");

// destructor will be called and file will be deleted

?>
