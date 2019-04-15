<?php

function validatePIN($pin)
{
  return (strlen($pin) <= 0) ? false : preg_match("/^(\d{4}||\d{6})$/", $pin);
}

if (validatePIN("123456"))
  echo "true\n";
else
  echo "false\n";

?>
