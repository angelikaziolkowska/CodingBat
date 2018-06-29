/*
Angelika Ziolkowska 
June 2018

Task description:

Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

public String stringSplosion(String str) {
  String stri = "";
  if(str.length()>=2){
    for(int i=0;i<str.length();i++){
      stri=stri+ str.substring(0,i+1);
    }
    return stri;
  }
  return str;
}






