/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string, return true if the first instance of "x" in the string 
is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

boolean doubleX(String str) {
  if(str.length()<2 || str.length()>2 && str.charAt(0)=='x'&&str.charAt(1)!='x'){
    return false;
  }
  if(str.length()==2 && str.charAt(0)=='x'&&str.charAt(1)=='x'){
    return true;
  }
  else if(str.charAt(0)=='x'&&str.charAt(1)=='x'){
    return true;
  }
  else return doubleX(str.substring(1));
}







