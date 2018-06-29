/*
Angelika Ziolkowska 
June 2018

Task description:


Given a string, return a new string where the first and last 
chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
*/

public String frontBack(String str) {

  if (str.length() > 1)
  {
    char[] newstr = str.toCharArray();
    char[] copy = str.toCharArray();
    newstr[0] = copy[str.length()-1];
    newstr[str.length()-1] = copy[0];
    str = String.valueOf(newstr);
  }
  return str;
}

