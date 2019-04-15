<?php

function noOdds($arr)
{
  $na = array();
  forEach($arr as $i)
    if ($i % 2 == 0)
      array_push($na, $i);
  return $na;
}

?>
