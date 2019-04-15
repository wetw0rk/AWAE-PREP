<?php

function sortNumAscending($arr) {
  sort($arr);
  return $arr;
}

print_r(sortNumAscending([1,2,10,50,5]));

?>
