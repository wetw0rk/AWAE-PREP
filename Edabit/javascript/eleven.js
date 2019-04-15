function isAvgWhole(arr) {
  let v = 0;
  for (let i = 0;i < arr.length; i++)
  {
    v += arr[i];
  }
  v /= arr.length;
          
  return (((v % 1) == 0) ? true : false);           
}
