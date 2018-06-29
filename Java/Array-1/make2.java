/*
Angelika Ziolkowska 
June 2018

Task description:

Given 2 int arrays, a and b, return a new array length 2 containing, 
as much as will fit, the elements from a followed by the elements 
from b. The arrays may be any length, including 0, but there will 
be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
*/

public int[] make2(int[] a, int[] b) {
  int[] n=new int[2];
  int i=0;
  while(i<2&&i<a.length&&a[i]!=0){
    n[i]=a[i];
    i++;
  }
  int j=i;
  i=0;
  while(j<2&&i<b.length&&b[i]!=0){
    n[j]=b[i];
    i++;
    j++;
  }
  return n;
}






