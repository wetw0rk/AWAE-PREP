function factorial(int) {
  let fact = 1;
  if (int >= 0)
    for (let i = 1; i < (int+1); i++)
      fact = fact*i;
  return fact;
}
