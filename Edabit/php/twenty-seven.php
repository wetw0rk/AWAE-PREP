<?php

function flipEndChars($str)
{
  if (gettype($str) != "string" || strlen($str) < 2)
    return "Incompatible";

  $arr = str_split($str);
  $li = sizeof($arr)-1;

  if ($arr[0] === $arr[$li])
    return "Two's a pair";

  $tmp      = $arr[0];
  $arr[0]   = $arr[$li];
  $arr[$li] = $tmp;

  return implode('', $arr);
}

$example1 = "Cat, dog, and mouse.";
$example2 = "ada";
$example3 = "Ada";
$example4 = "z";
$example5 = [1, 2, 3];

echo sprintf("%s\n", flipEndChars($example1));
echo sprintf("%s\n", flipEndChars($example2));
echo sprintf("%s\n", flipEndChars($example3));
echo sprintf("%s\n", flipEndChars($example4));
echo sprintf("%s\n", flipEndChars($example5));

?>
