<?php

/*
Create a function that takes an array of 10 numbers (between 0 and 9) and returns
a string of those numbers formatted as a phone number (e.g (555) 555-5555)

NOTE: we could have also done
  return vsprintf('(%d%d%d) %d%d%d-%d%d%d%d', $numbers);
 
*/

function formatPhoneNumber($number) {
  return sprintf("(%s) %s-%s\n",
    implode("", array_slice($number, 0, 3)),
    implode("", array_slice($number, 3, 3)),
    implode("", array_slice($number, -4, 6))
  );
}

echo formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]);

?>
