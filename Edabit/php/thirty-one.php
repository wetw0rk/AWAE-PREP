<?php

function getMiddle($str)
{
  return ((($len = strlen($str)) % 2) == 0) ? $str[($len/2)-1] . $str[$len/2] : $str[($len-1)/2];
}

echo getMiddle("testing")."\n";

?>
