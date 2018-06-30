/*
Angelika Ziolkowska 
June 2018

Task description:


Given a string, compute recursively a new string where all the 'x' chars have been removed.


noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
*/

public String noX(String str) {
  if(str.length()==0){
    return str;
  }
  else if(str.substring(0,1).equals("x")){
    return noX(str.substring(1));
  }
  return str.substring(0,1)+noX(str.substring(1));
}






