<?php

function isFourLetters($arr)
{
  $ls = sizeof($arr); 
  for ($i = 0; $i < $ls; $i++)
    if (strlen($arr[$i]) != 4) 
      unset($arr[$i]);
  return array_values($arr);
}

$example = ["Kangaroo", "Bear", "Fox"];

print_r(isFourLetters($example));

?>
