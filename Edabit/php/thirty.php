<?php

/*

I could have also done:
  return substr_count(decbin($i), '1');
 
*/

function countOnes($i)
{
  $binary = str_split(decbin($i));
  $ac = sizeof($binary);
  $ct = 0;

  for ($i = 0; $i < $ac; $i++)
    if ($binary[$i] === '1')
      $ct++;

  return $ct;
}

echo sprintf("%d\n", countOnes(0));

?>
