<?php

// Create a function that accepts an array and returns the last item in the array

function getLastItem($arr)
{
  return $arr[sizeof($arr)-1];
}

$array = ['test', 'test2', 'test3'];

echo sprintf("%s\n", getLastItem($array));

// NOTES: we could have also used end();

?>
