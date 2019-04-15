<?php

/*
Create a function that takes a string and returns a string with it's
letters in alphabetical order
*/

function AlphabetSoup($str) {
  $arr = str_split($str, 1);
  sort($arr);

  return implode('', $arr);
}

echo sprintf("return str = %s\n", AlphabetSoup("cdab"));

?>
