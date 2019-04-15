function isValidPhoneNumber($str) {
  return (preg_match("/^\(\d{3}\) \d{3}-\d{4}$/", $str)) ? true : false;
}
