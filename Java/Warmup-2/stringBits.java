/*
Angelika Ziolkowska 
June 2018

Task description:


Given a string, return a new string made of every other char starting with 
the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
*/

public String stringBits(String str) {
  if(str.length()==0){
    return "";
  }
  else if(str.length()<3){
    return str.substring(0,1);
  }
  else return str.substring(0,1) +stringBits(str.substring(2));
}







