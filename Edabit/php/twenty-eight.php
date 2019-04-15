<?php

/*
we could have also done:
  return array_sum(array_map('abs', $arr));
*/

function getAbsSum($arr)
{
  $total = 0;
  forEach($arr as $i)
    $total += abs($i);
  return $total;
}

$array = [2, -1, 4, 8, 10];

echo sprintf("%d\n", getAbsSum($array));

?>
