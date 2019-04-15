function factorial(x) {
  let f = 1;
  if (x >= 0)
    for (let i = 1; i < (x+1); i++)
      f *= i;
  return f;
}
