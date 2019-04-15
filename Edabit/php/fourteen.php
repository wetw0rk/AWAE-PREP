<?php

function isEvenOrOdd($num) {
  return ($num % 2 == 0) ? "even" : "odd";
}

echo sprintf("%s\n", isEvenOrOdd(3));

?>
