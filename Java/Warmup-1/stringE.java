/*
Angelika Ziolkowska 
June 2018

Task description:

Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
*/

public boolean stringE(String str) {
  int e=0;
  for(int i=0; i < str.length();i++) {
    if(str.charAt(i)=='e') {
      e++;
    }
  }
  return (e>0&&e<4);
}

