/*
Angelika Ziolkowska 
June 2018

Task description:

Given three ints, a b c, return true if it is possible to add two 
of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
*/

public boolean twoAsOne(int a, int b, int c) {
  a = Math.abs(a);
  b = Math.abs(b);
  c = Math.abs(c);
  if(a>=b&&a>=c) {
    return (b+c==a);
  }
  else if(b>=a&&b>=c) {
    return (a+c==b);
  }
  else if(c>=a&&c>=b) {
    return (a+b==c);
  }
  return false;
}






