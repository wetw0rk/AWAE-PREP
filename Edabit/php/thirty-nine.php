<?php

function isValidPhoneNumber($str)
{
  // ^      : start of string anchor
  // \(     : start with (
  // \d{3}  : 3 digits [0-9]
  // \)     : ends with )
  // \d{3}  : 3 digits [0-9]
  // -      : -
  // \d{4}  : 4 digits [0-9]
  // $      : end of anchor
  return preg_match("/^\(\d{3}\) \d{3}-\d{4}$/", $str);
}

if (isValidPhoneNumber("(1111)555-2345"))
  echo "match\n";
else
  echo "nope\n";

?>
