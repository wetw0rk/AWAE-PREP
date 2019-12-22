<?php

/*
create a function that takes a number as its only argument and returns true if it's less than
or equal to zero, otherwise return false.
*/

function lessThanOrEqualToZero($num)
{
  if ($num <= 0)
    return true;
  return false;
}

$r = lessThanOrEqualToZero($argv[0]);

var_dump( $r );

?>
