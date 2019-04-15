function charCount(myChar, str) {
  let list = str.split('')
  let ctr = 0;
  for (let i = 0; i < str.length; i++)
    if (list[i] == myChar)
      ctr++;
  return ctr;
}
