<?php

function checkEnding($str1, $str2)
{
  return (substr($str1, -(strlen($str2))) === $str2) ? true : false;
}

if (checkEnding("abc", "f") == true)
  print("yep\n");
else
  print("lol nope\n");

?>
