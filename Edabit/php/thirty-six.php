<?php

function removeSpecialCharacters($str)
{
  // <pattern> <replacement> <string>
  return preg_replace('/[^A-Za-z0-9\-_\ ]/', '', $str);
}

echo removeSpecialCharacters("hello$ $%#world")."\n";

?>
