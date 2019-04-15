<?php

/*

Create a function the takes an array of numbers and returns the following statistics
  - Min
  - Max
  - Length of array
  - Average Value

*/

function minMaxLengthAverage($arr)
{
  return [min($arr), max($arr), count($arr), (array_sum($arr)/count($arr))];
}

print_r(minMaxLengthAverage([6 , 9, 15, -2, 92, 11]));

?>
