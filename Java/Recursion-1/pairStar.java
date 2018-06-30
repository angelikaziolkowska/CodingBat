/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string, compute recursively a new string where identical chars that 
are adjacent in the original string are separated from each other by a "*".


pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
*/

public String pairStar(String str) {
  if(str.length()<=1 || str.length()==2&&str.charAt(0)!=(str.charAt(1))){
    return str;
  }
  else if(str.length()==2&&str.charAt(0)==(str.charAt(1))){
    return str.charAt(0)+"*"+str.substring(1);
  }
  else if(str.charAt(0)==str.charAt(1)){
    return str.substring(0,1)+"*"+pairStar(str.substring(1));
  }
  else return str.substring(0,1)+pairStar(str.substring(1));
}






