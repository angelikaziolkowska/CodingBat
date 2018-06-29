/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string, return a string made of the first 2 chars 
(if present), however include first char only if it is 'o' 
and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
*/

public String startOz(String str) {
  String ret ="";
  if(str.length()>=2){
    if(str.substring(0,2).equals("oz")){
      ret = "oz";
    }
    else if(str.substring(0,1).equals("o")){
      ret = "o";
    }
    else if(str.substring(1,2).equals("z")){
      ret = "z";
    }
  }
  else if(str.length()==1){
    if(str.substring(0,1).equals("o")){
      ret = "o";
    }
  }
  return ret;
}

