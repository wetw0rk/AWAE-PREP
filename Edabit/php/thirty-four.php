<?php

function validateEmail($str)
{
  if (sizeof($arr = explode("@", $str)) == 2) {                         // split aka [0]=x, [1]=x.com
    if (strlen($arr[0]) >= 1 && substr_count($arr[1], ".com") == 1) {   // len([0] >= 1 && ".com" in [1]
      $narr = explode('.', $arr[1]);                                    // split aka n[0]=x, n[1]=com
      if (strlen($narr[0]) >= 1)                                        // len(n[0]) >= 1
        return true;                                                    // return true
    }
  }
  return false;
}

echo "r: ";
echo var_export(validateEmail("pen.tester@gmail.com"))."\n";

?>
