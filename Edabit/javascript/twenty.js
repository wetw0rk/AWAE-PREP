function reverse(bool) {
  if (typeof bool != 'boolean') {
    return "boolean expected";
  }
  else {
    if (bool == true)
      return false;
    else
      return true;
  }
}
