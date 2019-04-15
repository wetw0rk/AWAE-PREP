<?php

include 'logfile.php';

$obj = new LogFile();
$obj->filename = '.htaccess';

echo serialize($obj)."\n";

?>
