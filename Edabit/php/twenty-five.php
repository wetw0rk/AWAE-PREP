<?php

function silenceTrump($str)
{
  $arr = str_split($str);
  $ln = sizeof($arr);

  for ($i = 0; $i < $ln; $i++) {
    switch (strtolower($arr[$i])) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        unset($arr[$i]);
        break;
    }
  }
  return implode('', $arr);
}

$example = "I have never seen a thin person drinking diet coke";

echo sprintf("%s\n", silenceTrump($example));

?>
