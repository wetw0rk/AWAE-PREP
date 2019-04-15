<?php

function XO($str)
{
  return (substr_count(strtoLower($str), 'x') == substr_count(strtoLower($str), 'o')) ? true : false;
}

echo "response: ";
echo var_export(XO("XoOxm")) . "\n";

?>
