<?php

// Given a number n, write a function that returns PI to n decimal places

function myPi($n) {
  return (round(pi(), $n));
}

echo sprintf("%f\n", myPi(5));

?>
