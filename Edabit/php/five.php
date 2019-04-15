<?php

/*
Create a function that accepts a string (of a persons first and last name) and returns
a string with the first and last name swapped.
*/

function nameShuffle($str) {
  /*
  1. explode: split the string into an array using ' ' as delimeter
  2. array_reverse: reverse the array
  3. implode: join array and combine with ' '
  */
  return implode(' ', array_reverse(explode(' ', $str)));
}

$name = "Lamar Kendrick";

echo sprintf("%s\n", nameShuffle($name));

?>
