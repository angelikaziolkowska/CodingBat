/*
Angelika Ziolkowska 
June 2018

Task description:

Given an int n, return true if it is within 10 of 100 or 200. 
Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
*/

public boolean nearHundred(int n) {
  if (90<=n&&n<=110||190<=n&&n<=210)
  {
    return true;
  }
  else return false;
}

