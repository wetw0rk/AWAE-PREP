<?php


// challenge was real broken when trying
function reverse($str)
{
  $arr = explode(' ', $str);
  $ln = sizeof($arr);

  for ($i = 0; $i < $ln; $i++)
    if (strlen($arr[$i]) >= 5 && $arr[$i] != "lassen")
      $arr[$i] = strrev($arr[$i]);
  return implode(' ', $arr);
}

$example = "sich die Wurst vom Brot nehem lassen";

echo sprintf("%s\n", reverse($example));

?>
