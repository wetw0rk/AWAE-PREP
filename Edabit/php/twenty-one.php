<?php

function sortDecending($num)
{
  $order = str_split(strval($num));
  rsort($order);
  return (int) implode('', $order);
}

echo sprintf("%d\n", sortDecending(123));

?>
