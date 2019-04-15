<?php

function wurstIsBetter($str)
{
  $sausage = array(
    "Kielbasa",
    "Chorizo",
    "Moronga",
    "Salami",
    "Sausage",
    "Andouille",
    "Naem",
    "Merguez",
    "Gurka",
    "Snorkers",
    "Pepperoni",
  );
  $ct = sizeof($sausage);
  $res = $str;
  
  for ($i = 0; $i < $ct; $i++)
  {
    if (substr_count(strtoLower($res), strtoLower($sausage[$i])) >= 1)
    {
      $res = str_ireplace($sausage[$i], "Wurst", $res);
    }
  }
  return $res;
}

echo wurstIsBetter("sausage fests are like Sausage fests")."\n";


?>
