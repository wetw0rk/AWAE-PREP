<?php

/*

We could have also used the following:

  return array_values(array_diff([1,2,3,4,5,6,7,8,9,10], $arr))[0];

  1. array_diff: returns an array containing the difference
  2. array_values: return array containing all values of returned array
  3. [0] index the new array value

*/

function missingNums($arr)
{
  for ($f = 0, $i = 0; $i < 11; $i++)
    if (!in_array($i, $arr))  // ! means not in_array()
      $f = $i;
  return $f;
}

echo  sprintf("%d\n", missingNums([1, 2, 3, 4, 6, 7, 8, 9, 10]));

?>
