/*
Angelika Ziolkowska 
June 2018

Task description:

Suppose the string "yak" is unlucky. Given a string, return a version 
where all the "yak" are removed, but the "a" can be any char. The "yak" 
strings will not overlap.


stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
*/

public String stringYak(String str) {
  String ret="";
  for(int i=0;i<str.length();i++){
    if(str.charAt(i)!='y'&&str.length()>i||i<=str.length()-3 && str.charAt(i+2)!='k'){
      ret=ret+str.charAt(i);
    }
    else if(i<=str.length()-3 && str.charAt(i)=='y'&&str.charAt(i+2)=='k'){
      i=i+2;
    }
    else ret=ret+str.charAt(i);
  }
  return ret;
}





