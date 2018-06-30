/*
Angelika Ziolkowska 
June 2018

Task description:


Given a string, compute recursively (no loops) the number of "11" 
substrings in the string. The "11" substrings should not overlap.


count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
*/

public int count11(String str) {
  if(str.length()<2 || str.length()==2 && str.charAt(0)!=str.charAt(1)){
    return 0;
  }
  else if(str.length()==2 && str.charAt(0)=='1'&&str.charAt(1)=='1'){
    return 1;
  }
  else if(str.charAt(0)=='1'&&str.charAt(1)=='1'){
    return 1+count11(str.substring(2));
  }
  else return count11(str.substring(1));
}






