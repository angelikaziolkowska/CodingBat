/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string and a non-negative int n, we'll say that the front of the string 
is the first 3 chars, or whatever is there if the string is less than length 3. 
Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
*/

public String frontTimes(String str, int n) {
  String ret="";
  int i=0,j=0;
  if(str.length()<3){
    while(i<n){
      ret=ret+str;
      i++;
    }
  }
  else {
    while(j<n){
      ret=ret+str.substring(0,3);
      j++;
    }
  }
  return ret;
}






