<?php

// Create a function that takes an array of numbers and returns the smallest number in the set

function findSmallestNum($arr)
{
  return min($arr);
}

$array = [1, -5, 8, 20];

echo sprintf("r = %d\n", findSmallestNum($array));

?>
