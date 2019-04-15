<?php

function cumulativeSum($array)
{
  $new_array = array();
  for ($i = 0; $i < sizeof($array); $i++)
  {
    $new_array[$i] = $array[$i];
    if ($i != 0)
      for ($j = 0; $j < $i; $j++)
        $new_array[$i] += $array[$j];
  }
  return $new_array;
}

$e = [1, -2, 3];

print_r(cumulativeSum($e));

?>
