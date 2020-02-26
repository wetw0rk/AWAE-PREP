
<?php

/*
Find mean of a array containing more than 5 int values supplied into a function
which returns 2 decimal values.
*/

function mean($arr)
{
  return round((array_sum($arr) / count($arr)), 2);
}

echo sprintf("%f\n", mean([1,0,4,5,2,4,1,2,3,3,3]));

?>
