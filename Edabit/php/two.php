<?php

// create a function that takes a string and returns the word count. The string will be a sentence

function countWords($str)
{
  return sizeof(explode(' ', $str)); // explode will split, sizeof() is ... yeah
}

echo sprintf("r = %d\n", countWords("hello my name is"));


// NOTES: we could have also used str_word_count($str)

?>
