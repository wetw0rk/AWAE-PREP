<?php

function uniqueSort($arr)
{
  sort($arr);
  return array_values((array_unique($arr)));
}

$a = [1,1,1,2,3,6,6,4,5];

print_r(uniqueSort($a));

?>
