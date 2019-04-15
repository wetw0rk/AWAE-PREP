<?php

function maskify($str)
{
  $arr = str_split($str);
  $oln = sizeof($arr)-4;

  if ($oln >= 1)
    for ($i = 0; $i < $oln; $i++)
      $arr[$i] = '#';
  return implode('', $arr);
}

print_r(maskify("4556364607935616"));

?>
