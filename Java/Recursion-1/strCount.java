/*
Angelika Ziolkowska 
June 2018

Task description:

Given a string and a non-empty substring sub, compute recursively the number 
of times that sub appears in the string, without the sub strings overlapping.


strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
*/

public int strCount(String str, String sub) {
  if(str.length()<sub.length() || str.length()==sub.length()&& !str.equals(sub)){
    return 0;
  }
  else if(str.length()==sub.length() && str.equals(sub)){
    return 1;
  }
  else if(str.substring(0,sub.length()).equals(sub)){
    return 1+strCount(str.substring(sub.length()),sub);
  }
  else if(str.substring(0,sub.length()).equals(sub)){
    return strCount(str.substring(sub.length()),sub);
  }
  return strCount(str.substring(1),sub);
}







