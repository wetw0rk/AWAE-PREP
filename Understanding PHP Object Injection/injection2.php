<?php

include "index2.php";

$obj = new FileClass();
$obj->filename = 'x';

echo serialize($obj);

?>
