<?php

/*
Create a function that accepts a string of space seperated numbers and
returns the highest and lowest number (as a string).
*/

function highLow($str)
{
  $arr = array_map('intval', explode(' ', $str));
  return sprintf("%d %d", max($arr), min($arr));
}

echo highLow("1 2 3 4 5");

?>
