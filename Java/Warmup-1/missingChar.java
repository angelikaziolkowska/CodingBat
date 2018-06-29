/*
Angelika Ziolkowska 
June 2018

Task description:

Given a non-empty string and an int n, return a new string 
where the char at index n has been removed. The value of n 
will be a valid index of a char in the original string 
(i.e. n will be in the range 0..str.length()-1 inclusive).


missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"
*/

public String missingChar(String str, int n) {
  char[] newstr = str.toCharArray();
  for (int i=n;i < str.length()-1;i++)
  {
    newstr[i] = newstr[i+1];
  }
  
  str = String.valueOf(newstr);
  
  return str.substring(0,str.length()-1);
}

