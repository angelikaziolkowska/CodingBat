/*
Angelika Ziolkowska 
June 2018

Task description:

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
*/

public int[] front11(int[] a, int[] b) {
  int[] m=new int[1];
  int[] p=new int[0];
  if(a.length>0&&b.length>0){
    int[] n=new int[2];
    n[0]=a[0];
    n[1]=b[0];
    return n;
  }
  else if(a.length>0){
      m[0]=a[0];
  }
  else if(b.length>0){
      m[0]=b[0];
  }
  else{
    return p;
  }
  return m;
}






