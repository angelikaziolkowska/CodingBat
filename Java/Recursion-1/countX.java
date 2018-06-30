/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.


countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/

public int countX(String str) {
  if (str.length() == 0) {
    return 0;
  }
  int count = 0;
  if (str.substring(0, 1).equals("x")) {
    count = 1;
  }
  return count + countX(str.substring(1));
}






