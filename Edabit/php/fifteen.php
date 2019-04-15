<?php

function doubleChar($str) {
  for ($arr = str_split($str), $nstr = "", $i = 0; $i < count($arr); $i++)
    $nstr .= sprintf("%s%s", $arr[$i], $arr[$i]);
  return $nstr;
}

echo doubleChar("bob");

?>
