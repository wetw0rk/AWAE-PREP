<?php

function addUp($num) {
  for ($i = 0, $tmp = $num; $i < $num; $i++)
    $tmp += $i;
  return $tmp;
}

echo sprintf("%d\n", addUp(4));

?>
