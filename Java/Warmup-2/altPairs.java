/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string, return a string made of the chars at indexes 
0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/

public String altPairs(String str) {
  String ret="";
  for(int i=0;i<str.length();i+=4){
    if(str.length()>i+1){
      ret=ret+str.substring(i,i+2);
    }
    else ret=ret+str.substring(i,i+1);
  }
  return ret;
}





