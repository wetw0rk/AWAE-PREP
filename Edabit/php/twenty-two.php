<?php

function removeDups($arr)
{
  return array_values(array_unique($arr));
}

print_r(removeDups(["JoHn", "John", "Taylor", "John"]));

?>
