<?php

function filterArray($arr)
{
  $lc = count($arr); // gotta initialize first for whatever reason
  for ($i = 0; $i < $lc; $i++) {
    echo sprintf("arr[%d] = %s\n", $i, $arr[$i]);
    if (is_string($arr[$i]))
      unset($arr[$i]);
  }
  
  return $arr;
}

$r = [1, 2, "hi", 0, 15, "test"];

print_r(filterArray($r));

?>
