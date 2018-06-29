/*
Angelika Ziolkowska 
June 2018

Task description:

Given three ints, a b c, one of them is small, one is medium and one 
is large. Return true if the three values are evenly spaced, so the 
difference between small and medium is the same as the difference 
between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
*/

public boolean evenlySpaced(int a, int b, int c) {
  if(a>b&&a>c&&b>c&&a-b==b-c || a>b&&a>c&&b<c&&a-c==c-b ||
  a<b&&a>c&&b>c&&b-a==a-c || a<b&&a<c&&b>c&&b-c==c-a ||
  a>b&&a<c&&b<c&&c-a==a-b || a<b&&a<c&&b<c&&c-b==b-a || 
  a==b&&b==c){
    return true;
  }
  return false;
}






