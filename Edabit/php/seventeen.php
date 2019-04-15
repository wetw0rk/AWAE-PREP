<?php

function capMe($arr)
{
  $narr = array();
  forEach($arr as $i)
    array_push($narr, ucwords(strtolower($i)));
  return $narr;
}

$name = ["samuel", "MABELLE", "letitia", "meridith"];

capMe($name);

?>
