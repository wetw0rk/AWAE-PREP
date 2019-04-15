<?php

function countVowels($str)
{
  $vowels = ['a', 'e', 'i', 'o', 'u'];
  $count = 0;

  for ($i = 0; $i < sizeof($vowels); $i++)
    $count += substr_count(strtoLower($str), $vowels[$i]);
  return $count;
}

echo "Found ".countVowels("Celebration")." vowels\n";

?>
