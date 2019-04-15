function isSymmetrical(num) {
  let strArr = num.toString().split("");
  let str1 = "", str2 = "";
        
  for (let i = 0; i < Math.ceil(strArr.length/2); i++)
    str1 += strArr[i];
  if ((strArr.length % 2) == 1)
    str2 += strArr[Math.ceil(strArr.length/2)-1];
  for (let i = Math.ceil(strArr.length/2); i < strArr.length; i++)
    str2 += strArr[i];
  if (str1.split("").reverse().join("") == str2)
    return true;
  return false;
}
