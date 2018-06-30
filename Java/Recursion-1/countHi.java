/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string, compute recursively (no loops) the number of times 
lowercase "hi" appears in the string.


countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
*/

public int countHi(String str) {
  int count=0;
  if(str.length()<=1){
    return count;
  }
  else if(str.substring(0,2).equals("hi")) {
    count++;
  }
  return count+countHi(str.substring(1));
}






